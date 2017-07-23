package com.jianggy.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void service(){
		dao.dao();
	}
	
	
}
