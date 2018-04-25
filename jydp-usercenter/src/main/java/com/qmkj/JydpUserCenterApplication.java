package com.qmkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@MapperScan(basePackages = {"com.qmkj.dao"})
public class JydpUserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JydpUserCenterApplication.class, args);
	}
}
