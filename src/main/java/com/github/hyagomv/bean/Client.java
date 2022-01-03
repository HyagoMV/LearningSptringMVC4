package com.github.hyagomv.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Client {

	@Autowired
	private Jdbc<ClassA, Long> jdbc;
	
	public void register(ClassA entity) {
		jdbc.save(entity);
	}

	public ClassA findFirst() {
		return jdbc.findById(1L);
	}
}
