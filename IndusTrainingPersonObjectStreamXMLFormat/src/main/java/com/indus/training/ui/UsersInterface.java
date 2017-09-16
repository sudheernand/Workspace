package com.indus.training.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.indus.training.persist.entity.PersonDetails;
import com.indus.training.persist.exception.PersonDAOException;
import com.indus.training.persist.impl.PersonsDAO;

public class UsersInterface {

	public PersonDetails createUI() throws PersonDAOException {

		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student first name");

		String first = userIn.next();
		System.out.println("enter student middle name");
		String middle = userIn.next();
		System.out.println("enter student last name");
		String last = userIn.next();
		System.out.println("enter id");
		String id = userIn.next();
		PersonDetails personObj = new PersonDetails();
		personObj.setFirstname(first);
		personObj.setLastname(last);
		personObj.setMiddlename(middle);
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
		try {
			pdObj.find(id);
		} catch (PersonDAOException e) {
			e.printStackTrace();
		}

	}

	public void deleteUI() {

		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student id");
		String id = userIn.next();

		PersonsDAO personDADObj = new PersonsDAO();
		try {
			personDADObj.delete(id);
		} catch (PersonDAOException e) {
			e.printStackTrace();
		}

	}

	public PersonDetails upadateUI() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter id");
		String id = userIn.next();

		PersonDetails personObj = new PersonDetails();

		personObj.setId(id);

		File srcFile = new File(id + ".txt");

		if (srcFile.exists()) {

			Scanner useIn = new Scanner(System.in);
			System.out.println("enter student first name");
			String f = useIn.next();
			System.out.println("enter student middle name");
			String m = useIn.next();
			System.out.println("enter student last name");
			String l = useIn.next();
			personObj.setFirstname(f);
			personObj.setLastname(l);
			personObj.setMiddlename(m);
			PersonsDAO personDADObj = new PersonsDAO();
			try {
				personDADObj.update(personObj);
			} catch (PersonDAOException e) {
				e.printStackTrace();
			}

		}

		else {

			System.out.println("file does not exists");
			System.exit(0);
		}
		return personObj;

	}

	public void crudOptions() throws PersonDAOException {
		while (true) {
			System.out.println("_________________________________");
			System.out.println("SELECT OPTIONS");
			System.out.println();
			System.out.println();
			System.out.println("1 CREATE");
			System.out.println();
			System.out.println("2 FIND ");
			System.out.println();
			System.out.println("3 UPDATE ");
			System.out.println();
			System.out.println("4 DELETE");
			System.out.println();
			System.out.println("5 EXIT");

			System.out.println("__________________________________");

			Scanner scObj = new Scanner(System.in);
			String input = scObj.nextLine();
			int option = Integer.parseInt(input);

			if (option == 1) {

				// UsersInterface uiObj = new UsersInterface();
				// uiObj.createUI();
				createUI();

			} else if (option == 2) {
				findUI();
			}

			else if (option == 3) {
				upadateUI();
			} else if (option == 4) {
				deleteUI();
			} else if (option == 5) {
				System.exit(0);
			}
		}
	}
	// Scanner userIn = new Scanner(System.in);
	// System.out.println("enter id");
	// String id = userIn.next();
	//
	//
	// PersonDetails personObj = new PersonDetails();
	//
	// personObj.setId(id);
	// PersonsDAO personDADObj = new PersonsDAO();
	// personDADObj.update(personObj);

}
