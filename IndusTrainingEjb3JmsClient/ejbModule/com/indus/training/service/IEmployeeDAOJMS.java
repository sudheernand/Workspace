package com.indus.training.service;

import javax.ejb.Remote;

@Remote
public interface IEmployeeDAOJMS {
	public String find(Integer empId);

}
