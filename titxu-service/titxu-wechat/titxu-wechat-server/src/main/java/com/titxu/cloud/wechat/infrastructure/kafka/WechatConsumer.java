package com.titxu.cloud.wechat.infrastructure.kafka;

import com.alibaba.fastjson2.JSON;
import com.titxu.cloud.wechat.application.dto.WeChatDto;
import com.titxu.cloud.wechat.application.enums.WeChatMessageEnum;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class WechatConsumer {

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
                weChatMessageType.handleMessage(dto);
            });
        });

    }
}

