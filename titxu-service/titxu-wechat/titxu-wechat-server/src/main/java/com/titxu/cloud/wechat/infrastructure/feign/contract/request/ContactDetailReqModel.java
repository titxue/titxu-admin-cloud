package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class ContactDetailReqModel extends ClientReqModel {
    private String wxid;
}
