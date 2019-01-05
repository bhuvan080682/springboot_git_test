package com.bhuni.git.git_spring_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("welcome")
public class WelcomeController {
	@GetMapping
	public String helloGreeting(){
		return "welcome";
	}

}
