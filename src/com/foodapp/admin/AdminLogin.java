package com.foodapp.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.foodapp.util.ConnectionUtil;

public class AdminLogin {
	public static void adminLogin() throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email:");
		String email=sc.next();
		System.out.println("Enter the Password:");
		String password=sc.next();
		Connection connection=null;
		PreparedStatement statement=null;
		connection=ConnectionUtil.getConnection();
		String query="SELECT email,PASSWORD FROM admin_login WHERE email=?";
		statement=connection.prepareStatement(query);
		statement.setString(1,email);
		ResultSet result=statement.executeQuery();
		String adminEmail=null;
		String adminPassword=null;
		while(result.next()) {
			adminEmail=result.getString("email");
			adminPassword=result.getString("PASSWORD");	
		}
		if(adminEmail==null) {
			System.out.println("No record found..");
		}else if(adminPassword.equals(password)) {
			System.out.println("Admin Login sucessful..."+"\n");
			System.out.println("WELCOME TO FOOD ORDERING APP ADMIN"+"\n");
			AdminUpdates.adminUpdate();
		}else {
			System.out.println("Invalid Data");
		}
	}
}
