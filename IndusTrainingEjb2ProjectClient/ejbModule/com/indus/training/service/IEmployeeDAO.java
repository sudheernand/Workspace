package com.indus.training.service;

import javax.ejb.Remote;

@Remote
public interface IEmployeeDAO {
	public void find(Integer empId);

}
