package com.bhuni.git.git_spring_test.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "hello Greeting";
	}

}
