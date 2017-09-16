package com.indus.training.persist.service;

import javax.persistence.PersistenceException;

import com.indus.training.persist.entity.Location;

public interface ILocation {
	public Location select(Integer id) throws PersistenceException;

	public boolean create(Location jobObj) throws PersistenceException;

	public boolean update(Integer id) throws PersistenceException;
}
