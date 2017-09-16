package com.indus.training.ui.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * The persistent class for the employees database table.
 * 
 */
@Entity
@Table(name = "employees")
// @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
public class EmployeeDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	private String employeeId;

	@Column(name = "commission_pct")
	private String commissionPct;

	@Column(name = "department_id")
	private Integer departmentId;

	private String email;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "hire_date")
	private String hireDate;

	@Column(name = "job_id")
	private String jobId;

	@Column(name = "phone_number")
	private String phoneNumber;

	private String salary;
	@Column(name = "manager_id")
	private Integer managerId;

	public EmployeeDetails() {
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(String commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	

}