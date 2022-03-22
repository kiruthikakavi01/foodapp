package com.foodapp.model;

import java.util.List;


import com.foodapp.menu.dao.MenuDAO;
import com.foodapp.menu.dao.MenuDAOImpl;
import com.foodapp.search.dao.MenuSearchDAO;
import com.foodapp.search.dao.MenuSearchDAOImpl;

public class MenuTest {
	public static void main(String[] args) throws Exception {
		Menu menu = new Menu();
		menu.setId(8);
		menu.setVegDishes("Dosa");
		menu.setVegDishesPrice(100);
		menu.setNonVegDishes("Chicken 65");
		menu.setNonVegDishesPrice(100);
		//System.out.println(menu);
		//MenuDAO menuDAO = new MenuDAOImpl();
		//menuDAO.menuDelete(menu);
		MenuSearchDAO menuSearch=new MenuSearchDAOImpl();
		/*List<Menu> menuList=menuSearch.findAll();
		for(Menu menuLists:menuList) {
			System.out.println(menuLists);
		}*/
		
		menu=menuSearch.findByVegDishes("Dosa");
		System.out.println(menu);
		
		Menu menu1=new Menu();
		menu1=menuSearch.findByNonVegDishes("Chicken 65");
		System.out.println(menu1);
		
		//Select count(*) from table_name;
		int count=menuSearch.count();
		System.out.println(count);
		
		List<Menu> menuVegList=menuSearch.displayVegDishes();
		for(Menu menuLists:menuVegList) {
			System.out.println(menuLists);
		}
		
	}

}
