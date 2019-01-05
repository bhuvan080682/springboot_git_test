package com.bhuni.git.git_spring_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhuni.git.git_spring_test.service.GreetingService;
import com.bhuni.git.git_spring_test.service.NamaskaaraService;


@RequestMapping("namaskaara")
public class NamaskaaraController {
	@Autowired
	private NamaskaaraService namaskaaraService;
	
	public String helloGreeting(){
		System.out.println("Testing...");
		return namaskaaraService.namaskaara();
	}
}
