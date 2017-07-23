package com.jianggy.springmvc.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/annotation")
public class AnnotationController {
	@RequestMapping(value="/test1/{ownerId}")
	public String handlerMethod1(@PathVariable String ownerId){
		System.out.println("==========================================="+ownerId);
		return null;
	}
	
	@RequestMapping(value="/test2/{ownerId}")
	public String handlerMethod2(@PathVariable("ownerId") String ownerId){
		System.out.println("==========================================="+ownerId);
		return null;
	}
	
	@RequestMapping(value="/test3")
	public String handlerMethod3(@RequestParam String ownerId){
		System.out.println("==========================================="+ownerId);
		return null;
	}
	
	@RequestMapping(value="/test4")
	public String handlerMethod5(@ModelAttribute User user,Model model){
		System.out.println(user.getAge()+user.getName());
		return "index";
	}
}
