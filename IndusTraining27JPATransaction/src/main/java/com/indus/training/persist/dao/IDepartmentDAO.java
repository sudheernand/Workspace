package com.indus.training.persist.dao;

import org.springframework.data.repository.CrudRepository;

import com.indus.training.persist.entity.Department;

public interface IDepartmentDAO extends CrudRepository<Department, Integer> {

}
