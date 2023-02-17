package com.titxu.cloud.wechat.infrastructure.feign.factory;

import com.titxu.cloud.wechat.infrastructure.feign.fallback.RemoteWechatServiceFallback;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 回调工厂
 */
@Component
public class RemoteWechatServiceFallbackFactory implements FallbackFactory<RemoteWechatServiceFallback> {

    @Override
    public RemoteWechatServiceFallback create(Throwable throwable) {
        return new RemoteWechatServiceFallback(throwable);
    }


}
