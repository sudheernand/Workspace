package com.indus.training.persist.service;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;

public interface IEmployeeDAO {
	public Employee read(Integer eId) throws PersistException;

	public Employee readUsingHQl(String eId) throws PersistException;

	public Employee readUsingCriteria(String eId) throws PersistException;

	public Employee readUsingNativeSQL(String eId) throws PersistException;

	public Employee readUsingNamedQuery(String eId) throws PersistException;
}
