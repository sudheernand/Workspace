package com.indus.training.persist.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the employees database table.
 * 
 */
@Entity
@Table(name = "employees")
//@NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	private Integer employeeId;

	@Column(name = "commission_pct")
	private BigDecimal commissionPct;

	@Column(name = "department_id")
	private Integer departmentId;

	private String email;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "hire_date")
	private Timestamp hireDate;

	@Column(name = "job_id")
	private String jobId;

	@Column(name = "phone_number")
	private String phoneNumber;

	private BigDecimal salary;

	// bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Employee employee;

	// bi-directional many-to-one association to Employee
	@OneToMany(mappedBy = "employee")
	private List<Employee> employees;

	public Employee() {
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public BigDecimal getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(BigDecimal commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Timestamp hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setEmployee(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setEmployee(null);

		return employee;
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

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", commissionPct=" + commissionPct + ", departmentId="
				+ departmentId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", hireDate=" + hireDate + ", jobId=" + jobId + ", phoneNumber=" + phoneNumber + ", salary=" + salary
				+ ", employee=" + employee + ", employees=" + employees + "]";
	}

	
	
}