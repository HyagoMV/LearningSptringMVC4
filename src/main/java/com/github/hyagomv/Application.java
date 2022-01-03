package com.github.hyagomv;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.github.hyagomv.bean.ClassA;


@SpringBootApplication
public class Application  {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class);
		
		ClassA bean = applicationContext.getBean(ClassA.class);
		
		bean.sayHello();
	}
	
}
