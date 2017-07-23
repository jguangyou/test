package com.jianggy.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Service service = (Service) context.getBean("service");
        service.service();
    }
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
