package com.github.hyagomv.bean;

import org.springframework.stereotype.Component;

@Component
public class ClassB implements ClassX {
	
	public ClassB() {
		return;
	}

	public void sayHello() {
		System.out.println("Hello ClassB");
	}
	
}
