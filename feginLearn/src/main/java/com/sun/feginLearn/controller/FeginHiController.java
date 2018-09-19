package com.sun.feginLearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.feginLearn.service.IFeginService;

@RestController
public class FeginHiController {

	@Autowired
	IFeginService iFeginService;
	
	@GetMapping("/hi")
	public String sayHi(@RequestParam String name) {
		return iFeginService.sayHiFromClient(name);
	}
}
