package JDBC;

import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class PuttingValues {

	public static void main(String[] args)throws Exception {
	Connection c = null ;
	PreparedStatement ps = null;
	Scanner sc = new Scanner(System.in);
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c= DriverManager.getConnection("jdbc:mysql://localhost:3306/arpit","root","wowdigital");
		ps = c.prepareStatement("insert into student(id,name,city) values(?,?,?)") ;
		
		while(true) {
		
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		System.out.println("Enter the name :");
		String n = sc.next();
		System.out.println("Enter the city :");
		String ci = sc.next();
		
		ps.setInt(1, id);
		ps.setString(2, n);
		ps.setString(3, ci);
		ps.executeUpdate();
		System.out.println("Press yes/no to add more records");
		String cancel = sc.next();
		if(cancel.equalsIgnoreCase("no")) {
			System.out.println("You are exiting the app");
			break;}
		
		}
		
		
	} catch (Exception e) {System.out.println("Added a row");}
	finally {
		c.close();
    }

	}

}
