package com.indus.training.persist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the departments database table.
 * 
 */
@Entity
@Table(name = "departments")
@NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IDinDepartment departmentIDs;

	@Column(name = "department_name")
	private String departmentName;

	@Column(name = "manager_id")
	private Integer managerId;

	public Department() {
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public IDinDepartment getDepartmentIDs() {
		return departmentIDs;
	}

	public void setDepartmentIDs(IDinDepartment departmentIDs) {
		this.departmentIDs = departmentIDs;
	}

}