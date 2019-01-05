package com.bhuni.git.git_spring_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhuni.git.git_spring_test.service.GreetingService;

@RequestMapping("greetings")
public class GreetingController {
	@Autowired
	private GreetingService service;
	
	@GetMapping
	public String helloGreeting(){
		return service.display();
	}

}
