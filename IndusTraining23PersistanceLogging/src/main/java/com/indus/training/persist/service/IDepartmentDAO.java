package com.indus.training.persist.service;

import javax.persistence.PersistenceException;

import com.indus.training.persist.entity.Department;

public interface IDepartmentDAO {
	public Department select(Integer id) throws PersistenceException;
	public boolean create (Department depObj)throws PersistenceException;
	public boolean update (Integer id);

}
