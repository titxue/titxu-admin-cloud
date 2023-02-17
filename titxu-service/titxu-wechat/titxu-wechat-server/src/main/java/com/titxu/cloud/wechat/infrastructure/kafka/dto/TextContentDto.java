package com.titxu.cloud.wechat.infrastructure.kafka.dto;

import lombok.Data;

import java.util.List;

@Data
public class TextContentDto {
    private List<String> atUserList;
    private String fromWxid;
    private int isPc;
    private String msg;
    private String msgId;
    private String roomWxid;
    private long timestamp;
    private String toWxid;
    private int wxType;
    

}