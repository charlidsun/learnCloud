package com.sun.myProviderOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyProviderOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProviderOneApplication.class, args);
	}
}
