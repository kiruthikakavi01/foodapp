package com.foodapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.foodapp.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public void register(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
		    String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
		    String username="rev_user";
		    String password="rev_user";
		    Connection connection= DriverManager.getConnection(url,username,password);
		    System.out.println(connection);
		    String sql="INSERT INTO Food_Ordering_App_User_Register_Form(Full_name,Email,Contact_number,Create_Password,Conform_Password) VALUES(?,?,?,?,?)";
		    PreparedStatement statement=connection.prepareStatement(sql);
		    statement.setString(1,user.getName());
		    statement.setString(2,user.getEmail());
		    statement.setString(3,user.getContactNumber());
		    statement.setString(4,user.getCreatePassword());
		    statement.setString(5,user.getContactNumber());
		    System.out.println(sql);
		    int rows=statement.executeUpdate();
		    System.out.println("No of rows inserted:"+rows);
		    statement.close();
		    connection.close();
		    
		    		
	}

}
