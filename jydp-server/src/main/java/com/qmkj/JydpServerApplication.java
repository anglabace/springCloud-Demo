package com.qmkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JydpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JydpServerApplication.class, args);
	}
}
