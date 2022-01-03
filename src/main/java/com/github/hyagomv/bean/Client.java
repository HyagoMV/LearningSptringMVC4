package com.github.hyagomv.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component("client")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Client {

	@Autowired
	private Jdbc<ClassA, Long> jdbc;
	
	public void register(ClassA entity) {
		jdbc.save(entity);
	}

	public ClassA findFirst() {
		return jdbc.findById(1L);
	}
	
	public Jdbc<ClassA, Long> getJdbc() {
		return jdbc;
	}
}
