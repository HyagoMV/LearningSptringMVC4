package com.github.hyagomv.bean;

import org.springframework.stereotype.Component;

@Component
public class ClassADao extends Object implements Jdbc<ClassA, Long> {
	
	public ClassADao() {
		super();
		return;
	}

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
