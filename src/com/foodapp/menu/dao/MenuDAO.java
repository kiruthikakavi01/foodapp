package com.foodapp.menu.dao;

import java.sql.SQLException;

import com.foodapp.model.Menu;


public interface MenuDAO {
	void menuAdd(Menu menu) throws ClassNotFoundException, SQLException;
	void menuVegUpdate(Menu menu) throws ClassNotFoundException, SQLException;
	void menuNonVegUpdate(Menu menu)throws ClassNotFoundException, SQLException;
	void menuDelete(Menu menu)throws ClassNotFoundException,SQLException;
}
