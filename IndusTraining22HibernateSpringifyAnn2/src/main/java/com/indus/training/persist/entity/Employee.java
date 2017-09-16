package com.indus.training.persist.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5141659919993926748L;
	
	private String first_name;
	
	private String last_name;
	
	private Integer employee_id;
	
	private String job_id;
	
	private String email;
	
	private String phoneNumber;
	
	private Integer manager_id;
	
	private Integer department_id;
	
	private BigDecimal salary;
	
	private BigDecimal Commision_pct;
	
	private Date hire_date;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Commision_pct == null) ? 0 : Commision_pct.hashCode());
		result = prime * result + ((department_id == null) ? 0 : department_id.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((employee_id == null) ? 0 : employee_id.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
		result = prime * result + ((job_id == null) ? 0 : job_id.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((manager_id == null) ? 0 : manager_id.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Commision_pct == null) {
			if (other.Commision_pct != null)
				return false;
		} else if (!Commision_pct.equals(other.Commision_pct))
			return false;
		if (department_id == null) {
			if (other.department_id != null)
				return false;
		} else if (!department_id.equals(other.department_id))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employee_id == null) {
			if (other.employee_id != null)
				return false;
		} else if (!employee_id.equals(other.employee_id))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (hire_date == null) {
			if (other.hire_date != null)
				return false;
		} else if (!hire_date.equals(other.hire_date))
			return false;
		if (job_id == null) {
			if (other.job_id != null)
				return false;
		} else if (!job_id.equals(other.job_id))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (manager_id == null) {
			if (other.manager_id != null)
				return false;
		} else if (!manager_id.equals(other.manager_id))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	

	
	@Override
	public String toString() {
		return "Employees [first_name=" + first_name + ", last_name=" + last_name + ", employee_id=" + employee_id
				+ ", job_id=" + job_id + ", email=" + email + ", phoneNumber=" + phoneNumber + ", manager_id="
				+ manager_id + ", department_id=" + department_id + ", salary=" + salary + ", Commision_pct="
				+ Commision_pct + ", hire_date=" + hire_date + "]";
	}

	

	


	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getCommision_pct() {
		return Commision_pct;
	}

	public void setCommision_pct(BigDecimal commision_pct) {
		this.Commision_pct = commision_pct;
	}

}
