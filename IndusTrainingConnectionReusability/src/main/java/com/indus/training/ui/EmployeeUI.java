package com.indus.training.ui;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

import com.indus.training.persist.entity.EmployeeDetails;
import com.indus.training.persist.exception.EmployeeDAOException;
import com.indus.training.persist.impl.EmployeeDAO;

public class EmployeeUI {
	java.sql.Timestamp sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());

	public void selectUI() throws EmployeeDAOException {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter employee id");
		String id = userIn.nextLine();

		EmployeeDetails empObj = new EmployeeDetails();
		int idVal = Integer.parseInt(id);
		empObj.setEmployee_id(idVal);
		EmployeeDAO daoObj = new EmployeeDAO();
		daoObj.select(idVal);

	}

	public void createUI() throws EmployeeDAOException {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter employee id");
		String id = userIn.nextLine();
		int idVal = Integer.parseInt(id);
		System.out.println("enter employee firstName ");
		String firstName = userIn.nextLine();
		System.out.println("enter employee lastname ");
		String lastName = userIn.nextLine();
		System.out.println("enter employee email ");
		String email = userIn.nextLine();
		System.out.println("enter employee phone number ");
		String phoneNumber = userIn.nextLine();
		// System.out.println("enter employee hire date ");
		// String hire = userIn.nextLine();
		;

		System.out.println("enter employee jobID ");
		String jobId = userIn.nextLine();
		System.out.println("enter employee salary ");
		String salary = userIn.nextLine();
		BigDecimal salVal = new BigDecimal(salary);
		System.out.println("enter employee commission pct ");

		String commission = userIn.nextLine();
		BigDecimal commVal = new BigDecimal(commission);
		System.out.println("enter employee managerID ");
		String managerId = userIn.nextLine();
		int mangId = Integer.parseInt(managerId);
		System.out.println("enter employee  departmentID ");
		String departId = userIn.nextLine();
		int depId = Integer.parseInt(departId);
		EmployeeDetails empObj = new EmployeeDetails();
		empObj.setEmployee_id(idVal);
		empObj.setFirstName(firstName);
		empObj.setLastName(lastName);
		empObj.setEmail(email);
		empObj.setPhoneNumber(phoneNumber);
		empObj.setHireDate(sqlDate);
		empObj.setJobID(jobId);
		empObj.setSalary(salVal);
		empObj.setCommission_pct(commVal);
		empObj.setManagerId(mangId);
		empObj.setDepartmentId(depId);

		EmployeeDAO daoObj = new EmployeeDAO();
		daoObj.create(empObj);

	}

	public void update() {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter employee id");
		String id = userIn.nextLine();
		int idVal = Integer.parseInt(id);
		System.out.println("enter employee firstName ");
		String firstName = userIn.nextLine();
		System.out.println("enter employee lastname ");
		String lastName = userIn.nextLine();
		// System.out.println("enter employee email ");
		// String email = userIn.nextLine();
		// System.out.println("enter employee phone number ");
		// String phoneNumber = userIn.nextLine();
		// System.out.println("enter employee hire date ");
		// String hire = userIn.nextLine();
		//// ;
		//
		// System.out.println("enter employee jobID ");
		// String jobId = userIn.nextLine();
		// System.out.println("enter employee salary ");
		// String salary = userIn.nextLine();
		// BigDecimal salVal = new BigDecimal(salary);
		// System.out.println("enter employee commission pct ");
		//
		// String commission = userIn.nextLine();
		// BigDecimal commVal = new BigDecimal(commission);
		// System.out.println("enter employee managerID ");
		// String managerId = userIn.nextLine();
		// int mangId = Integer.parseInt(managerId);
		// System.out.println("enter employee departmentID ");
		// String departId = userIn.nextLine();
		// int depId = Integer.parseInt(departId);
		EmployeeDetails empObj = new EmployeeDetails();
		empObj.setEmployee_id(idVal);
		empObj.setFirstName(firstName);
		empObj.setLastName(lastName);

		// empObj.setEmail(email);
		// empObj.setPhoneNumber(phoneNumber);
		empObj.setHireDate(sqlDate);
		// empObj.setJobID(jobId);
		// empObj.setSalary(salVal);
		// empObj.setCommission_pct(commVal);
		// empObj.setManagerId(mangId);
		// empObj.setDepartmentId(depId);

		EmployeeDAO daoObj = new EmployeeDAO();
		daoObj.update(empObj);

	}

	public void crudOptionss() throws EmployeeDAOException {
		while (true) {
			System.out.println("- - - - - - - - - - - - ");
			System.out.println("_________________________________");
			System.out.println("SELECT OPTIONS");
			System.out.println();
			System.out.println();
			System.out.println("1 CREATE");
			System.out.println();
			System.out.println("2 SELECT ");
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
				selectUI();
			}

			else if (option == 3) {
				update();

			} else if (option == 5) {
				System.exit(0);
			}
		}
	}
}
