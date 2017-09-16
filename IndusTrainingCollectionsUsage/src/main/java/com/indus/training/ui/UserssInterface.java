package com.indus.training.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.indus.training.persist.entity.PersonssDetails;
import com.indus.training.persist.exception.PersonDAOException;
import com.indus.training.persist.impl.PersonssDAO;

public class UserssInterface {

	public List<PersonssDetails> createUI() throws PersonDAOException {
		Scanner userIn = new Scanner(System.in);

		List<PersonssDetails> personArrayList = new ArrayList<PersonssDetails>();

		System.out.println("enter no of students ");
		int count = userIn.nextInt();
		

		for (int i = 0; i < count; i++) {
			PersonssDetails personObj = new PersonssDetails();

			System.out.println("enter student first name");

			String first = userIn.next();
			System.out.println("enter student middle name");
			String middle = userIn.next();
			System.out.println("enter student last name");
			String last = userIn.next();
			System.out.println("enter id");
			String id = userIn.next();

			personObj.setFirstname(first);
			personObj.setLastName(last);
			personObj.setMidlleName(middle);
			personObj.setId(id);
			personArrayList.add(personObj);

		}
		PersonssDAO personDADObj = new PersonssDAO();
		personDADObj.create(personArrayList);

		return personArrayList;

	}

	public void findUI() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student id");
		String id = userIn.next();

		PersonssDetails personObj = new PersonssDetails();
		personObj.setId(id);
		PersonssDAO pdObj = new PersonssDAO();
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

		PersonssDAO personDADObj = new PersonssDAO();
		try {
			personDADObj.delete(id);
		} catch (PersonDAOException e) {
			e.printStackTrace();
		}

	}

	public PersonssDetails upadateUI() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter id");
		String id = userIn.next();

		PersonssDetails personObj = new PersonssDetails();

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
			personObj.setFirstname(l);
			personObj.setMidlleName(m);
			PersonssDAO personDADObj = new PersonssDAO();
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

	public void crudOptionss() throws PersonDAOException {
		while (true) {
			System.out.println("- - - - - - - - - - - - ");
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
