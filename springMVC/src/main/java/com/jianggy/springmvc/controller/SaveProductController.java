package com.jianggy.springmvc.controller;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
@RequestMapping("/test")
public class SaveProductController {
	@RequestMapping("/save.action/{param}/{param1}")
	public String test(@PathVariable int param,@PathVariable String param1){
		System.out.println("接受的参数为："+param);
		System.out.println("接受的参数为："+param1);
		StringHttpMessageConverter shc;
		DispatcherServlet dispatcherServlet;
		return "/productFrom";
	}
}
