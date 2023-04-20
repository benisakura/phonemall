package com.mall.phonemall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.mall.phonemall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class PhonemallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonemallMemberApplication.class, args);
    }

}
