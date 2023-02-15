package com.titxu.cloud.wechat.application.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MessageDto implements Serializable {
    private int type;

    private String Data;

}