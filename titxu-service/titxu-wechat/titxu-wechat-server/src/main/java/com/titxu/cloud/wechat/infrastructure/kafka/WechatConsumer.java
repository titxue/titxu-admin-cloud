package com.titxu.cloud.wechat.infrastructure.kafka;

import com.alibaba.fastjson2.JSON;
import com.titxu.cloud.wechat.application.service.WeChatMessageService;
import com.titxu.cloud.wechat.infrastructure.kafka.dto.WeChatDto;
import com.titxu.cloud.wechat.infrastructure.kafka.enums.WeChatMessageEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Component
public class WechatConsumer {

    private Map<String, WeChatMessageService> weChatMessageServiceMap;

    private static final String TOPIC_NAME = "wechat-events";

    /**
     * 11046 文本消息
     * 11047 图片消息
     * 11048 语音消息
     * 11051 视频消息
     * 11052 表情消息
     * 11053 地理位置消息
     *
     */

    //监听一个或者多个Topic
    @KafkaListener(topics = WechatConsumer.TOPIC_NAME)
    public void handler(String message){
        System.out.println("收到消息(old)："+message);
        Optional.ofNullable(message).ifPresent(msg -> {
            WeChatDto weChatDto = JSON.parseObject(msg, WeChatDto.class);
            Optional.ofNullable(weChatDto).ifPresent(dto -> {
                WeChatMessageEnum weChatMessageType = WeChatMessageEnum.getByType(dto.getMessage().getType());
                getService(weChatMessageType.getHandler()).ifPresent(service -> service.handleMessage(dto));
            });
        });

    }

    private Optional<WeChatMessageService> getService(String handler) {
        WeChatMessageService service = weChatMessageServiceMap.get(handler);
        if (service != null){
            return Optional.of(service);
        }
        log.info("未找到对应的消息处理器");
        return Optional.empty();
    }

    @Autowired
    public void setWeChatMessageServiceMap(Map<String, WeChatMessageService> weChatMessageServiceMap) {
        this.weChatMessageServiceMap = weChatMessageServiceMap;
    }
}

