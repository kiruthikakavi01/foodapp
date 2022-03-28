package com.foodapp.menu.dao;

import java.sql.SQLException;

import com.foodapp.model.Menu;


public interface MenuDAO {
	void menuAdd() throws ClassNotFoundException, SQLException;
	void menuVegUpdatePrice() throws ClassNotFoundException, SQLException;
	void menuNonVegUpdatePrice()throws ClassNotFoundException, SQLException;
	void menuDelete()throws ClassNotFoundException,SQLException;
}
