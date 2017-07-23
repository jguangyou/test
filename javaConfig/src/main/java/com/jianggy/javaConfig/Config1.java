package com.jianggy.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config1 {
	@Bean
	public Dao dao() {
		return new Dao();
	}

	@Bean
	public Service service() {
		Service service = new Service();
		service.setDao(dao());
		return service;
	}
}
