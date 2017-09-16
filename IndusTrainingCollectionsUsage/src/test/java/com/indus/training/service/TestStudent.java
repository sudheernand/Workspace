package com.indus.training.service;

import com.indus.training.persist.exception.PersonDAOException;
import com.indus.training.ui.UserssInterface;

public class TestStudent {
	public static void main(String[] args) {
		UserssInterface u2iObj = new UserssInterface();
		try {
			u2iObj.crudOptionss();
		} catch (PersonDAOException e) {
			e.printStackTrace();
		}

	}
}
