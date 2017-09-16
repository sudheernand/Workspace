package com.indus.training.persist.service;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;

public interface IEmployeeDAO {
	public Employee emp = new Employee();
	public Employee read(Integer eId) throws PersistException;

	public Employee readUsingHQl(Integer eId) throws PersistException;

	public Employee readUsingCriteria(Integer eId) throws PersistException;

	public Employee readUsingNativeSQL(Integer eId) throws PersistException;

	public Employee readUsingNamedQuery(Integer eId) throws PersistException;
}
