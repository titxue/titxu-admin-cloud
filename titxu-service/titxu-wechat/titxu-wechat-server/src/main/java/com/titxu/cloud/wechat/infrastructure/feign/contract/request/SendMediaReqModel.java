package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class SendMediaReqModel extends SendMsgReqModel {

    private String filePath = "";
    private String url = "";
}
