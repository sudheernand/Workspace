package com.indus.training.ui;

import java.util.Scanner;

import com.indus.training.persist.entity.Person;
import com.indus.training.persist.impl.PersonDAO;

public class UserInterface {

	public Person createUI() {

		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student first name");

		String f = userIn.next();
		System.out.println("enter student middle name");
		String m = userIn.next();
		System.out.println("enter student last name");
		String l = userIn.next();
		System.out.println("enter id");
		String id = userIn.next();
		Person personObj = new Person();
		personObj.setFirstname(f);
		personObj.setLastname(l);
		personObj.setMiddlename(m);
		personObj.setId(id);

		PersonDAO pdObj = new PersonDAO();
		pdObj.create(personObj);
		return personObj;	

	}

	public Person findUI() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student id");
		String id = userIn.next();

		Person personObj = new Person();
		personObj.setId(id); 
		PersonDAO pdObj = new PersonDAO();
		pdObj.find(personObj);
		
		return personObj;

	}

	public Person deleteUI() {

		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student id");
		String id = userIn.next();

		Person personObj = new Person();
		personObj.setFirstname(id);
		return personObj;

	}

	public Person upadateUI() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter id");
		String id = userIn.next();
		System.out.println("enter student first name");
		String f = userIn.next();
		System.out.println("enter student middle name");
		String m = userIn.next();
		System.out.println("enter student last name");
		String l = userIn.next();

		Person personObj = new Person();
		personObj.setFirstname(f);
		personObj.setFirstname(l);
		personObj.setFirstname(m);
		personObj.setFirstname(id);

		return personObj;
	}

}
