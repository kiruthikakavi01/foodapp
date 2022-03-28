package com.foodapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.foodapp.home.ListMenus;
import com.foodapp.model.User;
import com.foodapp.user.login.LoginDetails;
import com.foodapp.util.ConnectionUtil;

public class UserDAOImpl implements UserDAO{

	@Override
	public void register(User user) throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		    String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
		    String username="rev_user";
		    String password="rev_user";
		    Connection connection= DriverManager.getConnection(url,username,password);
		
		    String sql="INSERT INTO Food_Ordering_App_User_Register_Form(Full_name,Email,Contact_number,Create_Password,Conform_Password) VALUES(?,?,?,?,?)";
		    PreparedStatement statement=connection.prepareStatement(sql);
		    statement.setString(1,user.getName());
		    statement.setString(2,user.getEmail());
		    statement.setString(3,user.getContactNumber());
		    statement.setString(4,user.getCreatePassword());
		    statement.setString(5,user.getConformPassword());
		
		    int rows=statement.executeUpdate();
		    if(rows==1) {
		    	System.out.println("Register sucessful"+"\n");
		    	System.out.println("WELCOME TO FOOD ORDERING APP"+"\n");	
		    	LoginDetails.login();
		
		    }
		    
		    statement.close();
		    connection.close();
		    
		    		
	}

	@Override
	public void findAllUser() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		connection = ConnectionUtil.getConnection();
		String query=" SELECT S_N0,Full_name,Email,Contact_number,Conform_Password FROM Food_Ordering_App_User_Register_Form";
		statement = connection.prepareStatement(query);
		rs = statement.executeQuery();
		System.err.println("\nS.No \t\t Full_Name \t\t Email \t\t\t\t ContactNumber \t\t Conform_Password");
		while (rs.next()) {
			Integer id = rs.getInt("S_N0");
			String fullName = rs.getString("Full_name");
			String email = rs.getString("Email");
			String contactNumber = rs.getString("Contact_number");
			String conformPassword = rs.getString("Conform_Password");

			
			System.out.format("\n%d \t\t %s \t\t %s \t\t %s \t\t %s\n", id, fullName, email, contactNumber,
					conformPassword);
			
		}
		
	}

}
