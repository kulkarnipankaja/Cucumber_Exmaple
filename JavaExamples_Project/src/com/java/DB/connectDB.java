package com.java.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class connectDB {

	public static void main(String[] args) throws Exception {
		
		String appempName ="tester";//compare this value with the database value
		//step 1-connecting to the database
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//step 2-connection object
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","username","pwd"")
		//step 3-Crerating a statement object
				Statement stmt =con.createStatement();
		//step 4-Result set object
		ResultSet rs=stat.executeQuery("Select * from emp");
		//step 5-retrive data as it an be multiple rows
		while (rs.next()) {
			
			//Scenario-creating a user and checking that user is present in the database or not
			String empname=rs.getString(1);
			int empid= rs.getInt(2);
			
			//we will go into database ans select * from flights where username="empname"
			
			if (empname==appempName) {
				
				
			}
				
			} else {

			}
			rs.next();
		}
	con.close();
	}




