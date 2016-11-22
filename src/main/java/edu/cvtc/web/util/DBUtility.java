package edu.cvtc.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author gcedarblade
 *
 */
public class DBUtility {

	public static final String CONNECTION = "jdbc:sqlit:person.db";
	public static final int TIMEOUT = 30;
	
	private static final String DRIVER_NAME = "org.sqlite.JDBC";
	
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		
		// register the driver
		Class.forName(DRIVER_NAME);
		
		// create the database connection
		return DriverManager.getConnection(CONNECTION);
		
	}
	
}
