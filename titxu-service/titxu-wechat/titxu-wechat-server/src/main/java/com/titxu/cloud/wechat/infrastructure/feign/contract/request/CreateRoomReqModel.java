package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateRoomReqModel extends ClientReqModel {


    /**
     * memberList : 群成员列表
     */

    private List<String> memberList;
}
