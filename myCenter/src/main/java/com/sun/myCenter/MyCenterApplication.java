package com.sun.myCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCenterApplication.class, args);
	}
}
