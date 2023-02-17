package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class ClientOpenReqModel extends ClientReqModel {
    private Boolean smart = Boolean.TRUE;

    private Boolean showLoginQrcode = Boolean.FALSE;
}
