package com.titxu.cloud.wechat.application.enums;

import com.titxu.cloud.wechat.application.dto.WeChatDto;

import java.util.function.Consumer;

public enum WeChatMessageEnum {
    TEXT(11046, dto -> System.out.println("收到文本消息：" + dto)),
    IMAGE(11047, dto -> System.out.println("收到图片消息：" + dto)),
    VOICE(11048, dto -> System.out.println("收到语音消息：" + dto)),
    VIDEO(11051, dto -> System.out.println("收到视频消息：" + dto)),
    EXPRESSION(11052, dto -> System.out.println("收到表情消息：" + dto)),
    LOCATION(11053, dto -> System.out.println("收到位置消息：" + dto));

    private final int type;
    private final Consumer<WeChatDto> handler;

    WeChatMessageEnum(int type, Consumer<WeChatDto> handler) {
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

    public void handleMessage(WeChatDto dto) {
        handler.accept(dto);
    }
}