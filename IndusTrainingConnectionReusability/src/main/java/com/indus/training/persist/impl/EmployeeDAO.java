package com.indus.training.persist.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

import com.indus.training.persist.entity.EmployeeDetails;
import com.indus.training.persist.exception.EmployeeDAOException;
import com.indus.training.persist.service.IEmployeeDAO;
import com.indus.training.utils.DBPoolUtil;
import com.indus.training.utils.DButils;

public class EmployeeDAO implements IEmployeeDAO {
	
	
	public boolean select(int id) throws EmployeeDAOException {
	
		boolean result = false;

		BasicDataSource bd = null;
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// dbConnection =
			// DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb",
			// "postgres", "27406298");
			bd = DBPoolUtil.getDatasource();
			dbConnection = bd.getConnection();

			stmt = dbConnection.createStatement();
			rs = stmt.executeQuery("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = " + id + ";");

			while (rs.next()) {
				System.out.println("FIST_NAME:" + rs.getString("FIRST_NAME"));
				result = true;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {

				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {

				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (dbConnection != null) {

				try {
					dbConnection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;

	}

	public void create(EmployeeDetails empDetailsObj) throws EmployeeDAOException {
		System.out.println("new create");
		BasicDataSource bd = null;
		Connection dbConnection = null;
		PreparedStatement stmt = null;
		String fName = empDetailsObj.getFirstName();
		int idVal = empDetailsObj.getEmployee_id();

		try {
			bd = DBPoolUtil.getDatasource();
			dbConnection = bd.getConnection();
			// dbConnection = DButils.getConnection();
			stmt = dbConnection.prepareStatement("INSERT INTO EMPLOYEES VALUES (?,?,?,?,?,?,?,?,?,?,?);");
			// DButils.getPreparedStatement(dbConnection, "INSERT INTO EMPLOYEES
			// VALUES (?,?,?,?,?,?,?,?,?,?,?);");

			System.out.println(empDetailsObj.getFirstName());

			stmt.setInt(1, idVal);
			stmt.setString(2, fName);
			stmt.setString(3, empDetailsObj.getLastName());
			stmt.setString(4, empDetailsObj.getEmail());
			stmt.setString(5, empDetailsObj.getPhoneNumber());
			stmt.setTimestamp(6, empDetailsObj.getHireDate());
			stmt.setString(7, empDetailsObj.getJobID());
			stmt.setBigDecimal(8, empDetailsObj.getSalary());
			stmt.setBigDecimal(9, empDetailsObj.getCommission_pct());
			stmt.setInt(10, empDetailsObj.getManagerId());
			stmt.setInt(11, empDetailsObj.getDepartmentId());
			// stmt = dbConnection.prepareStatement(
			// "INSERT INTO EMPLOYEES VALUES ('" + idVal + "','" + fName + "','"
			// + empDetailsObj.getLastName()
			// + "','" + empDetailsObj.getEmail() + "','" +
			// empDetailsObj.getPhoneNumber() + "','"
			// + empDetailsObj.getHireDate() + "','" + empDetailsObj.getJobID()
			// + "','"
			// + empDetailsObj.getSalary() + "','" +
			// empDetailsObj.getCommission_pct() + "','"
			// + empDetailsObj.getManagerId() + "','" +
			// empDetailsObj.getDepartmentId() + "');");
			// stmt.execute("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = " +
			// id);
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			DButils.closePreparedStatement(stmt);
			DButils.closeConnection(dbConnection);
		}

	}

	public void update(EmployeeDetails empDetailsObj) {

		Connection dbConnection = null;
		Statement stmt = null;
		String fName = empDetailsObj.getFirstName();
		int idVal = empDetailsObj.getEmployee_id();

		try {

			dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "27406298");
			stmt = dbConnection.createStatement();
			// stmt.execute("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = " +
			// id);
			stmt.execute("UPDATE  employees SET  first_name ='" + fName + "',last_name='" + empDetailsObj.getLastName()
					+ "' WHERE employee_id =" + empDetailsObj.getEmployee_id() + ";");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (stmt != null) {

				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (dbConnection != null) {

				try {
					dbConnection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
