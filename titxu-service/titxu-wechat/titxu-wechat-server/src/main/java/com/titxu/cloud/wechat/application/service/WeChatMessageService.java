package com.titxu.cloud.wechat.application.service;

import com.titxu.cloud.wechat.infrastructure.kafka.dto.WeChatDto;

public interface WeChatMessageService {
        void handleMessage(WeChatDto dto);
}
