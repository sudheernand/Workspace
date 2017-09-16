package com.indus.training.persist.service;

import javax.persistence.PersistenceException;

import com.indus.training.persist.entity.Country;

public interface ICountry {
	public Country select(Integer id) throws PersistenceException;
	public boolean create (Country conObj) throws PersistenceException;
	public boolean update (Country conObj)throws PersistenceException;
}
