package com.foodapp.search.dao;

import java.sql.SQLException;
import java.util.List;

import com.foodapp.model.Menu;

public interface MenuSearchDAO {
	//select * from table_name;
	List<Menu> findAll() throws SQLException;
	//select * from table_name where id=?;
	Menu findById(int id) throws SQLException;
	//SELECT Veg_dishes,Veg_Dishes_price FROM Food_Ordering_App_Menus WHERE Veg_dishes=?;
	Menu findByVegDishes(String vegDishes) throws SQLException;
	//SELECT Non_Veg_dishes,Non_Veg_dishes_price FROM Food_Ordering_App_Menus;
	Menu findByNonVegDishes(String nonVegDishes) throws SQLException;
	//select count(*) from  Food_Ordering_App_Menus;
	int count() throws SQLException;
	//select Veg_dishes,Veg_Dishes_price FROM Food_Ordering_App_Menus;
	List<Menu> displayVegDishes() throws SQLException;
	//select Non_Veg_dishes,Non_Veg_dishes_price FROM Food_Ordering_App_Menus;
	
}
