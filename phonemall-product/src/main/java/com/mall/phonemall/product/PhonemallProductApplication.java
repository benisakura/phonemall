package com.mall.phonemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages ="com.mall.phonemall.product.feign" )
@EnableDiscoveryClient
@MapperScan("com.mall.phonemall.product.dao")
@SpringBootApplication
public class PhonemallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonemallProductApplication.class, args);
	}

}
