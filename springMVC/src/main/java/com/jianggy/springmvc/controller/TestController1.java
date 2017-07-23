package com.jianggy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/test") 可以配置，也可以不配置
public class TestController1 {
	@RequestMapping("/test")
	public String handlerRequest(Model model){
		model.addAttribute("test", "第二个测试程序");
		return "/index";
	}
}
