package database;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

class CreateTable {
	public static void main(String args[]) {
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String CONNECTION = "jdbc:mysql://127.0.0.1/asad";
		try {
			Class.forName(DRIVER).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 Properties p = new Properties();
		    p.put("user","asadgenx");
		    p.put("password","Stexa@88");
		    
		try (Connection connection =DriverManager.getConnection(CONNECTION, p);
				Statement statement = connection.createStatement()) {
//				statement.executeUpdate("create table ACCOUNTS "
//						+ " (NAME VARCHAR(32) NOT NULL PRIMARY KEY, "
//						+ " ADDRESS VARCHAR(32), "
//						+ " BALANCE VARCHAR(32)) ");
				statement.executeUpdate(
						"insert into ACCOUNTS values "
								+ " ('Barry Burd', '222 Cyber Lane', '24.02')");
				statement.executeUpdate(
						"insert into ACCOUNTS values "
								+ " ('Joe Dow', '111 Luddite Street', '55.63')");
				
			 System.out.println("All done");
			 connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
