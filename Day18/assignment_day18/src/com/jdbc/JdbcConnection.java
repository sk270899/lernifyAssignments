package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String uName = sc.next();

		System.out.println("Enter password : ");
		String uPass = sc.next();
		

		
		Class.forName("org.postgresql.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/student", "postgres", "postgres");
//		Statement stmt = conn.createStatement();
		
//		create table
		
//		 boolean result=stmt.execute("create table facebook(uName varchar(10),uPass varchar(10))");
//		 System.out.println("Table created : " + result);
		 
//		 insert record
		
//		int result=stmt.executeUpdate("insert into facebook values('sahil','sahil@123')");
//		System.out.println("insert record  " + result);
		 
		
		PreparedStatement stmt=conn.prepareStatement("select * from facebook where uName=? and uPass=?");
        
        stmt.setString(1, uName);
        stmt.setString(2, uPass);
        
        ResultSet result=stmt.executeQuery();
        
        if(result.next()) {
      	  System.out.println("login succuss....");
        }else
        {
      	  System.out.println("login failed.... \nenter correct details");
        }
        conn.close();
	}

}
