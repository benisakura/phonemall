package com.mall.phonemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mall.phonemall.product.dao")
@SpringBootApplication
public class PhonemallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonemallProductApplication.class, args);
	}

}
