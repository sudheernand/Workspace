package com.indus.training.persist.service;

import com.indus.training.persist.entity.Country;
import com.indus.training.persist.exception.PersistException;

public interface ICountryDAO {
	public Country select(String id) throws PersistException;

	public boolean create(Country empDetailsObj) throws PersistException;

	public boolean update(Country empDetailsObj) throws PersistException;

}
