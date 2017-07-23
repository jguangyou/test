package com.jianggy.springmvc.controller;

import java.math.BigDecimal;

import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.WebApplicationInitializer;

public class Test {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("100");
		BigDecimal res = b1.multiply(new BigDecimal("0.7356"));
		BigDecimal bigDecimal = res.setScale(1, BigDecimal.ROUND_DOWN);
		System.out.println(bigDecimal.toString());
		WebApplicationInitializer  d;
		SpringServletContainerInitializer initializer;

	}

}
