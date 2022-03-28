package com.foodapp.dao;

import java.sql.SQLException;

import com.foodapp.model.User;

public interface UserDAO {
	void register(User user) throws ClassNotFoundException, SQLException, Exception;
	void findAllUser() throws SQLException;
}
