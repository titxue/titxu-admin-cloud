package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class SendTextReqModel extends SendMsgReqModel {
    private String content;
}
