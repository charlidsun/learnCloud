package com.sun.zutest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZutestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZutestApplication.class, args);
	}
}
