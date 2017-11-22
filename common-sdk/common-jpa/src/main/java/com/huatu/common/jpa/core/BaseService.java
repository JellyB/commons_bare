package com.huatu.common.jpa.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public abstract class BaseService<T,ID extends Serializable>{

	public abstract JpaRepository<T,ID> getDefaultDao();
	
	@Transactional(readOnly=true)
	public List<T> findAll(){
		return getDefaultDao().findAll();
	}
	@Transactional(readOnly = true)
	public T get(ID id){
		return  getDefaultDao().findOne(id);
	}
	@Transactional
	public T save(T t){
		return getDefaultDao().save(t);
	}
	@Transactional
	public void delete(T t){
		getDefaultDao().delete(t);
	}
	@Transactional(readOnly = true)
	public long count(){
		return getDefaultDao().count();
	}
}
