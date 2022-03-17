package com.foodapp.menu.dao;

import java.sql.SQLException;

import com.foodapp.model.Menu;


public interface MenuDAO {
	void menuAdd(Menu menu) throws ClassNotFoundException, SQLException;
	void menuUpdate(Menu menu) throws ClassNotFoundException, SQLException;
}
