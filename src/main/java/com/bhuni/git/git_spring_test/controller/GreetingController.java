package com.bhuni.git.git_spring_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("greetings")
public class GreetingController {
	
	@GetMapping
	public String helloGreeting(){
		return "hello";
	}

}
