package com.github.hyagomv.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.github.hyagomv.bean.ClassA;
import com.github.hyagomv.spring.bean.ClassB;

@SpringBootApplication
@ComponentScan("com.github.hyagomv")
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class);

		ClassA beanA = applicationContext.getBean(ClassA.class);
		beanA.sayHello();
		
		ClassB beanB = applicationContext.getBean(ClassB.class);
		beanB.sayHello();
	}

}
 
