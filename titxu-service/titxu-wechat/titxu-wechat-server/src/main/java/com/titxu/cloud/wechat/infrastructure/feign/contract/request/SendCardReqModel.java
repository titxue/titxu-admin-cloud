package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class SendCardReqModel extends SendMsgReqModel {

    private String cardWxid;
}
