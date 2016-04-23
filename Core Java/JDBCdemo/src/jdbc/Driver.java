package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {

		try {

			// Get Connection to DB
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "roots");

			// Create a Statement
			Statement myStmt = myConn.createStatement();

			// Execute SQL Query
			ResultSet myRs = myStmt.executeQuery("select * from city limit 5");

			// Process Result Set
			while (myRs.next()) {

				System.out.println(myRs.getString("Name") + "," + myRs.getString("CountryCode") + ","
						+ myRs.getString("District"));
				
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
