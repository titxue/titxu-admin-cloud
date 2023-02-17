package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class SendXmlReqModel extends SendMsgReqModel {
    private String xml = "";
}
