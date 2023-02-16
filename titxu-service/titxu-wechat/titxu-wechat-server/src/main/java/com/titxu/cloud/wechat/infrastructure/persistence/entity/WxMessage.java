package com.titxu.cloud.wechat.infrastructure.persistence.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "wx_messages")
public class WxMessage extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
