package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class CallbackKafkaReqModel {
    private String kafka_url = "localhost:9092";
    private String topic = "wechat-events";
    private Boolean open = true;
}
