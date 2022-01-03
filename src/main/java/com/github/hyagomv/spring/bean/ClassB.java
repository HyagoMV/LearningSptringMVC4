package com.github.hyagomv.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component("classB")
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON,
		proxyMode = ScopedProxyMode.NO)
public class ClassB {

	public void sayHello() {
		System.out.println("Hello ClassB");
	}
	
}
