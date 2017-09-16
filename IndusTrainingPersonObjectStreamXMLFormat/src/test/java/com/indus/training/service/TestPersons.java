package com.indus.training.service;

import com.indus.training.persist.exception.PersonDAOException;
import com.indus.training.ui.UsersInterface;

public class TestPersons {

	public static void main(String[] args) throws PersonDAOException {
		UsersInterface uiObj = new UsersInterface();
		// uiObj.upadateUI();
		// uiObj.createUI();
		// uiObj.findUI();
		// UserOptionsUI upObj =new UserOptionsUI();
		uiObj.crudOptions();

	}

}
