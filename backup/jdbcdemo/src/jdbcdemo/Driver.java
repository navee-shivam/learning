package jdbcdemo;

import java.sql.*;

public class Driver {

	private final static String connectionURL = "jdbc:mysql://127.0.0.1:3306/student";

	private final static String user = "root";

	private final static String password = "9909";

	public static void main(String[] args) {
		try {
			// Get a connection
			Connection myCon = DriverManager.getConnection(connectionURL, user,
					password);

			// Create statement
			Statement statement = myCon.createStatement();

			// Execute SQL
			ResultSet rs = statement.executeQuery("SELECT * FROM student_table");

			// Process the result
			while (rs.next()) {
				System.out.println(rs.getString("student_name") + " , "
						+ rs.getString("student_class"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
