package com.sun.zuulLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulLearnApplication.class, args);
	}
}
