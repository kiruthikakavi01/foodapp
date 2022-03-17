package com.foodapp.validator;

import com.foodapp.dao.UserDAO;
import com.foodapp.dao.UserDAOImpl;
import com.foodapp.model.User;

public class UserValidatorTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName("Ravi");
		user.setEmail("ravi@gmail.com");
		user.setContactNumber("7896456786");
		user.setCreatePassword("ravi1111");
		user.setConformPassword("");
		UserValidator.validatorUserDetails(user);
		UserDAO userDAO=new UserDAOImpl();
		userDAO.register(user);

	}

}
