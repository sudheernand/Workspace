package com.indus.training.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import weblogic.jdbc.common.internal.RmiDataSource;

/**
 * Session Bean implementation class EmployeeDAO
 */
@Stateless(mappedName = "jndiEmployeeDAOObj")
@LocalBean
public class EmployeeDAO implements IEmployeeDAO {

	/**
	 * Default constructor.
	 */
	public EmployeeDAO() {
	}

	public void find(Integer empId) {
		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext = null;
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			initContext = new InitialContext(env);
			RmiDataSource rmiObj = (RmiDataSource) initContext.lookup("jndiHrJDBCDataSource");
			conn = rmiObj.getConnection();
			stm = conn.prepareStatement("select * from Employees where EMPLOYEE_ID = ?;");
			stm.setInt(1, empId);
			rs = stm.executeQuery();
			while (rs.next()) {
				System.out.println("FIST_NAME:" + rs.getString("FIRST_NAME"));
			}

		} catch (NamingException e) {
			e.printStackTrace();
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
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (initContext != null) {
				try {
					initContext.close();
				} catch (NamingException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
