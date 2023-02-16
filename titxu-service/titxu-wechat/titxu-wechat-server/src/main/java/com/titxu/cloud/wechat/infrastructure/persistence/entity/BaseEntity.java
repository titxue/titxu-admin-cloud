package com.titxu.cloud.wechat.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Data
@Where(clause = "delFlag = 0")
public class BaseEntity {

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "del_flag")
    private char delFlag;

    @Column(name = "created_by")
    private String createdBy;

    @CreationTimestamp
    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @UpdateTimestamp
    @Column(name = "updated_time")
    private LocalDateTime updatedTime;
}
