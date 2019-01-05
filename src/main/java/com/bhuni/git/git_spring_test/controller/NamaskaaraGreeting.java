package com.bhuni.git.git_spring_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("namaskaara")
public class NamaskaaraGreeting {
	public String helloGreeting(){
		System.out.println("Testing...");
		return "namaskaara";
	}
}
