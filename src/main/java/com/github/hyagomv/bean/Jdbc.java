package com.github.hyagomv.bean;

public interface Jdbc<T, ID> {

	public void save(T entity);

	public T findById(ID id);

}
