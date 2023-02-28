package com.titxu.cloud.wechat;

import com.titxu.cloud.common.feign.config.FeignConfiguration;
import com.titxu.cloud.wechat.infrastructure.feign.config.FeignClientEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = {FeignConfiguration.class, FeignClientEncoder.class})
@EntityScan(basePackages = {"com.titxu.cloud.wechat.infrastructure.persistence.entity"})
public class CloudWechatApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudWechatApplication.class);
    }
}
