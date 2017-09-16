package com.indus.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DButils {

	public static Connection getConnection() {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "27406298");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

	public static boolean closeConnection(Connection connectionObj) {

		try {
			if (connectionObj != null) {
				connectionObj.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static PreparedStatement getPreparedStatement(Connection conn, String sql) {

		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pstm;
	}

	public static boolean closePreparedStatement(PreparedStatement pstmObj) {

		try {
			if (pstmObj != null) {
				pstmObj.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
