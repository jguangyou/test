package com.jianggy.paramTest.controller;

import javax.servlet.http.HttpServletRequest;

import org.assertj.core.data.Index;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Controller
public class ParamController1 {
	@RequestMapping("/con1")
	@ResponseBody
	public Customer handler(@RequestBody Customer customer) {
		System.out.println(customer.getName()+"===="+customer.getPsw() + "========================");
//		Customer customer = new Customer();
		customer.setName("就爱你观光游");
		customer.setPsw("dfdsfdsfdsfsda");
		MappingJackson2HttpMessageConverter converter;
//		return "indexdsfdsafdsafsdafdsas实打实的";
		return customer;
	}

	@RequestMapping("/con2/{param}/{intValue}")
	public String handler1(@PathVariable String param, @PathVariable("intValue") int a, HttpServletRequest request) {
		System.out.println(param + "===================" + a);
		return "index";
	}

	@RequestMapping("/con3")
	public String handler2(@CookieValue(value = "JSESSIONID", required = false) String sessionId) {
		System.out.println(sessionId + "========");
		return "index";
	}

	@RequestMapping("/con4")
	public String handler4(@RequestHeader(value = "User-Agent", required = false) String agent,
			@RequestHeader(value = "Accept", required = false) String[] accepts) {
		System.out.println(agent+"=======");
		for (String accept : accepts) {
			System.out.println(accept);
		}
		return "index";
	}
	
	@RequestMapping("/con5")
	public String handler5(Customer customer) {
		System.out.println(customer.getPsw()+"----"+customer.getName());
		return "index";
	}
//	@ModelAttribute("customer1")
//	public Customer getCustomer(@RequestParam(value="name",required=false) String name){
//		DispatcherServlet dispatcherServlet;
//		RequestMappingHandlerAdapter a;
//		System.out.println(name);
//		System.out.println("getCustomer=====================");
//		Customer customer = new Customer();
//		customer.setName("abc");
//		customer.setPsw("1234");
//		return customer;
//	}
}
