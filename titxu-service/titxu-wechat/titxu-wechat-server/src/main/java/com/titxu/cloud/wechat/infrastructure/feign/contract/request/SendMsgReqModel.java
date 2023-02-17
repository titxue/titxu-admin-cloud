package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class SendMsgReqModel extends ClientReqModel {


    private String toWxid;
}
