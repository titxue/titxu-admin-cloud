package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class ModifyRoomNameReqModel extends RoomReqModel {
    private String name;
}
