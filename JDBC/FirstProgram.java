package JDBC;

import java.sql.*;

public class FirstProgram {

	public static void main(String[] args) throws Exception {
		
		 Connection connection = null;
		    PreparedStatement query = null;
		    try {
		        Class.forName("com.mysql.cj.jdbc.Driver");

		        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arpit", "root", "wowdigital");
		        query = connection.prepareStatement( "SELECT * FROM student");
		        ResultSet rs = query.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt(1) +" ");
					System.out.print(rs.getString(2)+" ");
					System.out.print(rs.getString(3)+" ");
					System.out.println();
				}
		    } catch (Exception e)
		    {
		    	connection.close();
		    }
		    finally {
		    	connection.close();
		    }
	}
}

