package com.github.hyagomv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.github.hyagomv.bean.Client;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class);

		Client beanA = applicationContext.getBean(Client.class);

		System.out.println(beanA.findFirst());
		System.out.println(beanA.findFirst());
		System.out.println(beanA.findFirst());
	}

}
