package com.github.hyagomv.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

	@Autowired
	private Jdbc<ClassA, Long> jdbc;
	
	public Client() {
		return;
	}

	public void register(ClassA entity) {
		jdbc.save(entity);
	}

	public ClassA findFirst() {
		return jdbc.findById(1L);
	}
}
