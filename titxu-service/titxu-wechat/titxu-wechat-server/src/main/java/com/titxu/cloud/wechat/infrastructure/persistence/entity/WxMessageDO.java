package com.titxu.cloud.wechat.infrastructure.persistence.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "wx_messages")
@Comment("微信消息表")
@Where(clause = "delFlag = 0")
public class WxMessageDO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Comment("主键id")
    private Long id;

    @Column(name = "guid")
    @Comment("消息GUID")
    private String guid;
    
    @Column(name = "from_wxid")
    @Comment("发送消息的用户的微信ID")
    private String fromWxid;
    
    @Column(name = "to_wxid")
    @Comment("接收消息的用户或群聊的微信ID")
    private String toWxid;
    
    @Column(name = "room_wxid")
    @Comment("如果这是群聊消息，则为群聊的微信ID；否则为发送方或接收方的微信ID")
    private String roomWxid;

    @Lob
    @Column(name = "msg", columnDefinition = "LONGTEXT")
    @Comment("消息内容")
    private String msg;

    @Column(name = "msgid")
    @Comment("消息ID")
    private String msgId;

    @Column(name = "timestamp")
    @Comment("消息发送时间戳")
    private Long timestamp;
    
    @Column(name = "wx_type")
    @Comment("消息类型")
    private int wxType;
    
    @Column(name = "is_pc")
    @Comment("表示消息是否来自PC端")
    private int isPc;
    
    @Column(name = "at_user_list")
    @Comment("如果这是群聊消息并且@了某些人，则为被@的用户的微信ID的列表")
    private String atUserList;


    @Column(name = "remarks")
    @Comment("备注")
    private String remarks;

    @Column(name = "tenant_id")
    @Comment("所属租户")
    private String tenantId;

    @Column(name = "del_flag")
    @Comment("删除标识 0未删除，1已删除")
    private char delFlag;

    @Column(name = "created_by")
    @Comment("创建人")
    private String createdBy;

    @CreationTimestamp
    @Column(name = "created_time")
    @Comment("创建时间")
    private LocalDateTime createdTime;

    @Column(name = "updated_by")
    @Comment("更新人")
    private String updatedBy;

    @UpdateTimestamp
    @Column(name = "updated_time")
    @Comment("更新时间")
    private LocalDateTime updatedTime;
}
