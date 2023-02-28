package com.titxu.cloud.wechat.infrastructure.persistence.repository;

import com.titxu.cloud.wechat.infrastructure.persistence.entity.WxMessageDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WxMessageRepository extends JpaRepository<WxMessageDO, String> {
}
