package com.github.hyagomv.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ClassADao implements Jdbc<ClassA, Long> {
	
	@Override
	public void save(ClassA entity) {
		System.out.println("Save %s".formatted(entity));
	}

	@Override
	public ClassA findById(Long id) {
		System.out.print("FindById %d ".formatted(id));
		return new ClassA();
	}
	
}
