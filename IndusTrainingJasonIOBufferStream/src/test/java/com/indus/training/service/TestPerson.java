package com.indus.training.service;

import com.indus.training.persist.entity.Person;
import com.indus.training.persist.impl.PersonDAO;
import com.indus.training.ui.UserInterface;

public class TestPerson {

	public static void main(String[] args) {
		UserInterface uObj = new UserInterface();

		Person pObj = new Person();

		pObj = uObj.findUI();
		// persondaoObj.update(uObj.upadateUI());
//		System.out.println(pObj);
		

	}

}
