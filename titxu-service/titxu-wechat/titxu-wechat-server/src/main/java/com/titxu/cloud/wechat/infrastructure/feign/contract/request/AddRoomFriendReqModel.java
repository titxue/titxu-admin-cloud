package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class AddRoomFriendReqModel extends ClientReqModel {

    private String roomWxid;
    private String wxid;
    private String verify;
}
