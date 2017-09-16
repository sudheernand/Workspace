package com.indus.training.persist.service;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;

public interface IEmployeeDAO {
	public Employee select(Integer id) throws PersistException;

	public boolean create(Employee empDetailsObj) throws PersistException;

	public boolean update(Employee empDetailsObj) throws PersistException;

}
