package com.system.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<P,Q extends Serializable> 
{
	P getOne();
	
	List<P> find();

	P find(final Q id);
	P load(final Q id);
	
	Serializable save(final P entity); 
	void update(final P entity);
	void remove(final P entity);
	void remove(final Q id);
	void remove(final Q [] id);
}