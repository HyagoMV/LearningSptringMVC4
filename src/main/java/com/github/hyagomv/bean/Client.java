package com.github.hyagomv.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client {

	@Autowired
	private ClassX classX;
	
	public Client() {
		return;
	}

	public ClassX getClassX() {
		return classX;
	}
}
