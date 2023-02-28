package com.titxu.cloud.wechat.infrastructure.persistence.converter;

import com.alibaba.fastjson2.JSONObject;
import com.titxu.cloud.wechat.infrastructure.kafka.dto.TextContentDto;
import com.titxu.cloud.wechat.infrastructure.kafka.dto.WeChatDto;
import com.titxu.cloud.wechat.infrastructure.persistence.entity.WxMessageDO;

import java.util.Optional;

public class WxMessageConverter {
    public static WxMessageDO toWxMessage(WeChatDto dto) {
        if (dto == null) {
            return null;
        }

        // 解析消息内容
        TextContentDto textContentDto = JSONObject.parseObject(dto.getMessage().getData(), TextContentDto.class);
        if (textContentDto == null) {
            return null;
        }

        // 转换成数据库实体
        WxMessageDO messageDO = new WxMessageDO();
        messageDO.setGuid(dto.getGuid());
        messageDO.setCreatedBy("system");
        // 字符串集合转换成逗号分割字符串
        Optional.ofNullable(textContentDto.getAtUserList()).ifPresent(list -> {
            String userIds = String.join(",", list);
            if (userIds.length() > 0) {
                messageDO.setAtUserList(userIds);
            }
        });
        messageDO.setFromWxid(textContentDto.getFromWxid());
        messageDO.setIsPc(textContentDto.getIsPc());
        messageDO.setMsg(textContentDto.getMsg());
        messageDO.setMsgId(textContentDto.getMsgId());
        messageDO.setRoomWxid(textContentDto.getRoomWxid() == null ? null : textContentDto.getRoomWxid());
        messageDO.setTimestamp(textContentDto.getTimestamp());
        messageDO.setToWxid(textContentDto.getToWxid());
        messageDO.setWxType(textContentDto.getWxType());
        return messageDO;
    }
}
