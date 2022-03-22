package com.foodapp.user.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.foodapp.model.User;
import com.foodapp.util.ConnectionUtil;

public class LoginDetails {
	public static void login(User user) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		connection = ConnectionUtil.getConnection();
		String query = "select Email,Conform_Password from Food_Ordering_App_User_Register_Form where Email=? AND Conform_Password=?";
		statement = connection.prepareStatement(query);
		statement.setString(1,user.getEmail());
		statement.setString(2,user.getConformPassword());
		ResultSet result = statement.executeQuery();
		System.out.println(query);
		System.out.println(result);
		System.out.println("Verified succesfully"+result);
		/*String useremail = null;
		String userpassword = null;
		while (result.next()) {
			useremail = result.getString(user.getEmail());
			userpassword = result.getString(user.getConformPassword());
		}
		if (useremail == null) {
			System.out.println("No records found - please register");
		} else if (userpassword.equals(user.getConformPassword())) {
			System.out.println("WELCOME TO food Ordering App");
		} else {
			System.out.println("Invalid Credentials");
		}*/
	}
}