package com.indus.training.utils;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBPoolUtil {

	public static BasicDataSource getDatasource() {

		BasicDataSource bd = new BasicDataSource();

		bd.setUrl("jdbc:postgresql://localhost:5432/mydb");
		bd.setUsername("postgres");
		bd.setPassword("27406298");

		return bd;
	}

}
