package com.jianggy.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;

public class InputProductController implements Controller {
	private static final Logger logger = LogManager.getLogger(InputProductController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("inputaction");BeanNameUrlHandlerMapping ean;DispatcherServlet d;
		return new ModelAndView("/productFrom");
	}

}
