package com.indus.training.persist.service;

import javax.persistence.PersistenceException;

import com.indus.training.persist.entity.Region;

public interface IRegion {
	public Region select(Integer id) throws PersistenceException;

	public boolean create(Region jobObj) throws PersistenceException;

	public boolean update(Integer id) throws PersistenceException;

}
