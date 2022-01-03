package com.github.hyagomv.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClassA implements ClassX {
	
	public ClassA() {
		return;
	}

	public void sayHello() {
		System.out.println("Hello ClassA");
	}
	
}
