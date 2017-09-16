package com.indus.training.persist.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.indus.training.persist.dao.IDepartmentDAO;
import com.indus.training.persist.entity.Department;

@Repository
public class DepartmentDAO {

	@Autowired
	private IDepartmentDAO daoObj;

	public Department findOne(Integer depId) {

		return daoObj.findOne(depId);

	}

}
