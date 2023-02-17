package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class RoomMembersReqModel extends CreateRoomReqModel {

    private String roomWxid;
}
