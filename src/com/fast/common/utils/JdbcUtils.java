package com.fast.common.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;

public class JdbcUtils {

	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static final String DBURL = "jdbc:mysql://192.168.1.108:3306/park?useUnicode=true&amp;characterEncoding=utf-8";
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";

	static {
		DbUtils.loadDriver(DBDRIVER);
	}

	public static Connection getConnection() {

		try {
			  return DriverManager.getConnection(DBURL, USER, PASSWORD);
		    } catch (SQLException e) {
			  return null;
		    }
	}

}
