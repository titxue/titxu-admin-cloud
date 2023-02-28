package com.titxu.cloud.wechat.infrastructure.kafka.dto;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class TextContentDto {

    @JSONField(name = "at_user_list")
    private List<String> atUserList;

    @JSONField(name = "from_wxid")
    private String fromWxid;

    @JSONField(name = "is_pc")
    private int isPc;
    private String msg;

    @JSONField(name = "msgid")
    private String msgId;

    @JSONField(name = "room_wxid")
    private String roomWxid;

    private Long timestamp;

    @JSONField(name = "to_wxid")
    private String toWxid;

    @JSONField(name = "wx_type")
    private int wxType;
    

}