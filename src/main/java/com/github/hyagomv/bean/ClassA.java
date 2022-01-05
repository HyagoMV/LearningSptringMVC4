package com.github.hyagomv.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component("classA")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON, 
		proxyMode = ScopedProxyMode.NO)
public class ClassA {

	public void sayHello() {
		System.out.println("Hello ClassA");
	}
	
	@PostConstruct
	public void postConstrutor() {
		System.out.println("Post Construtor");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("pre Destroy");
	}

}
