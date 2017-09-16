package com.indus.training.ui;

import java.util.Scanner;

import com.indus.training.persist.entity.PersonDetails;
import com.indus.training.persist.impl.PersonsDAO;

public class UsersInterface {
	public PersonDetails createUI() {

		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student first name");

		String f = userIn.next();
		System.out.println("enter student middle name");
		String m = userIn.next();
		System.out.println("enter student last name");
		String l = userIn.next();
		System.out.println("enter id");
		String id = userIn.next();
		PersonDetails personObj = new PersonDetails();
		personObj.setFirstname(f);
		personObj.setLastname(l);
		personObj.setMiddlename(m);
		personObj.setId(id);

		PersonsDAO personDADObj = new PersonsDAO();
		personDADObj.create(personObj);
		return personObj;

	}

	public void findUI() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student id");
		String id = userIn.next();

		PersonDetails personObj = new PersonDetails();
		personObj.setId(id);
		PersonsDAO pdObj = new PersonsDAO();
		pdObj.find(id);

	}

	public void deleteUI() {

		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student id");
		String id = userIn.next();

		PersonsDAO personDADObj = new PersonsDAO();
		personDADObj.delete(id);

	}

	public void upadateUI() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter id");
		String id = userIn.next();
		System.out.println("enter student first name");
		String f = userIn.next();
		System.out.println("enter student middle name");
		String m = userIn.next();
		System.out.println("enter student last name");
		String l = userIn.next();

		PersonDetails personObj = new PersonDetails();
		personObj.setFirstname(f);
		personObj.setFirstname(l);
		personObj.setFirstname(m);
		personObj.setFirstname(id);
		PersonsDAO personDADObj = new PersonsDAO();
		personDADObj.update(personObj);

	}
}
