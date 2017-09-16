package com.indus.training.persist.service;

import com.indus.training.persist.entity.PersonDetails;
import com.indus.training.persist.exception.PersonDAOException;

public interface IPersonDAO {
	public boolean create(PersonDetails personObj)throws PersonDAOException;
	public boolean update(PersonDetails personObj)throws PersonDAOException;
	public boolean delete(String param)throws PersonDAOException;
	public boolean find(String param)throws PersonDAOException;
	
	

}
