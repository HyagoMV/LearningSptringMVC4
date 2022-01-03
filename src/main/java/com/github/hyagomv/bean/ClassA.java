package com.github.hyagomv.bean;

import java.util.StringJoiner;

public class ClassA {

	@Override
	public String toString() {
		return ClassA.class.getSimpleName() + new StringJoiner(",", "[", "]");
	}
}
