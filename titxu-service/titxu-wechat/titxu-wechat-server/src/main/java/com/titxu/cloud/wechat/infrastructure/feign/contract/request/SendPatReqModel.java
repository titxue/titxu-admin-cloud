package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class SendPatReqModel extends ClientReqModel {

    private String roomWxid;


    private String pattedWxid;
}
