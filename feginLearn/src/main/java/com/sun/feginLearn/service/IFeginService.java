package com.sun.feginLearn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi")
public interface IFeginService {

	@GetMapping("/hi")
	String sayHiFromClient(@RequestParam String name);
	
}
