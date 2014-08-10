package database;

	import java.util.Properties;
	import java.sql.DriverManager;
	import java.sql.Connection;
	import java.sql.SQLException;

	public class mySQLTest
	{
	  // The JDBC Connector Class.
	  private static final String dbClassName = "com.mysql.jdbc.Driver";

	  // Connection string. emotherearth is the database the program
	  // is connecting to. You can include user and password after this
	  // by adding (say) ?user=paulr&password=paulr. Not recommended!

	  private static final String CONNECTION =    "jdbc:mysql://127.0.0.1/asad";

	  public static void main(String[] args) throws
	                             ClassNotFoundException,SQLException
	  {
	    System.out.println(dbClassName);
	    // Class.forName(xxx) loads the jdbc classes and
	    // creates a drivermanager class factory
	    Class.forName(dbClassName);

	    // Properties for user and password. Here the user and password are both 'paulr'
	    Properties p = new Properties();
	    p.put("user","asadgenx");
	    p.put("password","Stexa@88");

	    // Now try to connect
	    Connection c = DriverManager.getConnection(CONNECTION,p);

	    System.out.println("It works !");
	    c.close();
	    }
	}