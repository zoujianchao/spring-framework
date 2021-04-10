package com.zjc.service.impl;

import com.zjc.service.WelcomeService;


public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你: " + name);
		return "success";
	}
}
