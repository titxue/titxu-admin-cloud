package com.titxu.cloud.wechat.application.service.impl;

import com.titxu.cloud.wechat.application.service.WeChatMessageService;
import com.titxu.cloud.wechat.infrastructure.kafka.dto.WeChatDto;
import com.titxu.cloud.wechat.infrastructure.persistence.converter.WxMessageConverter;
import com.titxu.cloud.wechat.infrastructure.persistence.repository.WxMessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("text")
public class WeChatTextMessageService implements WeChatMessageService {

    private WxMessageRepository repository;

    @Override
    public void handleMessage(WeChatDto dto) {
        log.info("文本消息: {}", dto);
        repository.save(WxMessageConverter.toWxMessage(dto));
    }

    @Autowired
    public void setRepository(WxMessageRepository repository) {
        this.repository = repository;
    }
}
