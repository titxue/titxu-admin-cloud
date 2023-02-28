package com.titxu.cloud.wechat.infrastructure.kafka.enums;

import lombok.Getter;

@Getter
public enum WeChatMessageEnum {


    TEXT(11046, "text"),
    IMAGE(11047, "image"),
    VOICE(11048, "voice"),
    VIDEO(11051, "video"),
    // 表情
    EXPRESSION(11052, "expression"),
    // 地理位置
    LOCATION(11053,"location");

    private final int type;
    private final String handler;



    WeChatMessageEnum(int type, String handler) {
        this.type = type;
        this.handler = handler;
    }

    public static WeChatMessageEnum getByType(int type) {
        for (WeChatMessageEnum value : values()) {
            if (value.type == type) {
                return value;
            }
        }
        return TEXT;
    }

}