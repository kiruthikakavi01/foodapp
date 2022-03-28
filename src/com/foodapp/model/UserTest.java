package com.foodapp.model;

import com.foodapp.dao.UserDAO;
import com.foodapp.dao.UserDAOImpl;
//import com.foodapp.user.login.LoginDetails;

public class UserTest {

	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("Ramya");
		user.setEmail("ramya@gmail.com");
		user.setContactNumber("654323091");
		user.setCreatePassword("sheela098");
		user.setConformPassword("varun235");
		System.out.println(user);
		UserDAO userDAO = new UserDAOImpl();
		userDAO.register(user);
		//LoginDetails.login(user);
	}

}