package com.foodapp.model;

import java.util.List;
import java.util.Scanner;

import com.foodapp.menu.dao.MenuDAO;
import com.foodapp.menu.dao.MenuDAOImpl;
import com.foodapp.search.dao.MenuSearchDAO;
import com.foodapp.search.dao.MenuSearchDAOImpl;

public class MenuTest {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Menu menu = new Menu();
		System.out.println("Enter the veg dish: ");
		String vegName=sc.next();
		System.out.println("Enter the veg dish price: ");
		int vegPrice=sc.nextInt();
		System.out.println("Enter the nonVeg dish: ");
		String nonVegName=sc.next();
		System.out.println("Enter the nonVeg dish price: ");
		int nonVegPrice=sc.nextInt();
		
		
		//menu.setId(3);
		menu.setVegDishes(vegName);
		menu.setVegDishesPrice(vegPrice);
		
		menu.setNonVegDishes(nonVegName);
		menu.setNonVegDishesPrice(nonVegPrice);
		System.out.println(menu);
		MenuDAO menuDAO = new MenuDAOImpl();
		//menuDAO.menuAdd(menu);
		/*MenuSearchDAO menuSearch=new MenuSearchDAOImpl();
		List<Menu> menuList=menuSearch.findAll();
		for(Menu menuLists:menuList) {
			System.out.println(menuLists);
		}
		
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
		}*/
		
	}

}
