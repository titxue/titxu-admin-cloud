package com.titxu.cloud.wechat.infrastructure.feign.contract.request;

import lombok.Data;

@Data
public class ModifyFriendRemarkReqModel extends ClientReqModel {
    private String wxid;
    private String remark;
}
