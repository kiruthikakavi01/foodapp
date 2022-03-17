package com.foodapp.model;

import com.foodapp.menu.dao.MenuDAO;
import com.foodapp.menu.dao.MenuDAOImpl;

public class MenuTest {
	public static void main(String[] args) throws Exception {
		Menu menu = new Menu();
		menu.setVegDishes("Gobi Manchurian");
		menu.setVegDishesPrice(110);
		menu.setNonVegDishes("Prawn curry");
		menu.setNonVegDishesPrice(120);
		System.out.println(menu);
		MenuDAO menuDAO = new MenuDAOImpl();
		menuDAO.menuUpdate(menu);
	}

}
