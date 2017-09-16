package com.indus.training.persist.service;

import javax.persistence.PersistenceException;

import com.indus.training.persist.entity.Job;

public interface IJob {
	public Job select(Integer id) throws PersistenceException;

	public boolean create(Job jobObj) throws PersistenceException;

	public boolean update(Integer id) throws PersistenceException;

}
