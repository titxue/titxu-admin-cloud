package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class RoomReqModel extends ClientReqModel {

    private String roomWxid;
}