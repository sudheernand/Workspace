package com.indus.training.persist.service;

import java.math.BigDecimal;
import java.util.List;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;

public interface IEmployeeDAO {
	public Employee read(Integer eId) throws PersistException;

	public  List<Employee> readUsingHQl(Integer eId, BigDecimal sal) throws PersistException;

	public List<Employee> readUsingCriteria(Integer sal, Integer empId) throws PersistException;

	public List<Employee> readUsingNativeSQL(Integer eId,Integer sal) throws PersistException;

	public Employee readUsingNamedQuery(Integer eId) throws PersistException;
}
