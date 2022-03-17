package com.foodapp.model;

import com.foodapp.dao.UserDAO;
import com.foodapp.dao.UserDAOImpl;

public class UserTest {

	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("v.Hema");
		user.setEmail("vhema@gmail.com");
		user.setContactNumber("9721230910");
		user.setCreatePassword("Kvcet098");
		user.setConformPassword("Kvcet098");
		System.out.println(user);
		UserDAO userDAO = new UserDAOImpl();
		userDAO.register(user);
	}

}
