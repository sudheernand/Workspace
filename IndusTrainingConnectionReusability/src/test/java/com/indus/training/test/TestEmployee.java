package com.indus.training.test;

import com.indus.training.persist.exception.EmployeeDAOException;
import com.indus.training.persist.impl.EmployeeDAO;
import com.indus.training.ui.EmployeeUI;

public class TestEmployee {

	public static void main(String[] args) throws EmployeeDAOException {

		System.out.println(org.postgresql.Driver.getVersion());

		EmployeeUI uiObj = new EmployeeUI();
		// uiObj.createUI();
		// uiObj.selectUI();
		uiObj.crudOptionss();
	}

}
