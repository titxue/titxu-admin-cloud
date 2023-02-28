package com.titxu.cloud.wechat.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
public class BaseEntity {

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
