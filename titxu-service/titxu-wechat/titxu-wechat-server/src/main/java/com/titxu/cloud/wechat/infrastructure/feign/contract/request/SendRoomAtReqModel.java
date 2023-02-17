package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

import java.util.List;

@Data
public class SendRoomAtReqModel extends SendTextReqModel {


    private List<String> atList;
}
