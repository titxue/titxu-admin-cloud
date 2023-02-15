package com.titxu.cloud.wechat.infrastructure.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "wx_messages")
public class WxMessage {
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "guid")
    private String guid;
    
    @Column(name = "from_wxid")
    private String fromWxid;
    
    @Column(name = "to_wxid")
    private String toWxid;
    
    @Column(name = "room_wxid")
    private String roomWxid;
    
    @Column(name = "msg")
    private String msg;
    
    @Column(name = "timestamp")
    private int timestamp;
    
    @Column(name = "msgid")
    private String msgid;
    
    @Column(name = "wx_type")
    private int wxType;
    
    @Column(name = "is_pc")
    private int isPc;
    
    @Column(name = "at_user_list")
    private String atUserList;
    
    @Column(name = "type")
    private Integer type;
    
    @Column(name = "remarks")
    private String remarks;
    
    @Column(name = "tenant_id")
    private String tenantId;
    
    @Column(name = "del_flag")
    private char delFlag;
    
    @Column(name = "created_by")
    private String createdBy;
    
    @Column(name = "created_time")
    private LocalDateTime createdTime;
    
    @Column(name = "updated_by")
    private String updatedBy;
    
    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

}
