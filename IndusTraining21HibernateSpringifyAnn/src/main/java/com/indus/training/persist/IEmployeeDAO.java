package com.indus.training.persist;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;

public interface IEmployeeDAO {

	public Employee select (Integer empid) throws PersistException;
	
	public Boolean delete(Employee empObj) throws PersistException;
	
	public Boolean update (Employee empObj) throws PersistException;
	
	public Boolean insert (Employee empObj) throws PersistException;
	
}
