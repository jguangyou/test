package com.jianggy.paramTest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {
	@RequestMapping("/handler1")
	@ResponseBody // 标识响应数据直接放入Response的body中，不会经过视图解析处理
	public Customer handler1(@RequestBody Customer customer) {// 将reqeust
																// body中的数据通过HttpMessageConverter绑定到customer对象
		System.out.println("name:" + customer.getName());
		System.out.println("psw:" + customer.getPsw());
		return customer;
	}
}
