package JDBC;

import java.sql.*;
import java.io.*;

public class SavePic {

	public static void main(String[] args)throws Exception {
		Connection c=null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/arpit","root","wowdigital");
			
			String q = "insert into images(pic) values(?)";
			ps = c.prepareStatement(q);
			FileInputStream fis = new FileInputStream("C:\\download.png");
			ps.setBinaryStream(1, fis);
			ps.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println("Error");}
		finally {c.close(); System.out.println("cONNECTION CLOSED");}

	}

}
