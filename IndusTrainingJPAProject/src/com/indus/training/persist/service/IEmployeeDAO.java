package com.indus.training.persist.service;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistanceException;

public interface IEmployeeDAO {

	public Employee select(Integer id) throws PersistanceException;

	public Boolean create(Employee empDetailsObj) throws PersistanceException;

	public Boolean update(Employee empDetailsObj) throws PersistanceException;

	public Boolean delete(Integer id) throws PersistanceException;

}
