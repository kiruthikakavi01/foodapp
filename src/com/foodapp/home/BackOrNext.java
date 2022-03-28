package com.foodapp.home;

import java.sql.SQLException;
import java.util.Scanner;

import com.foodapp.order.OrderFood;

public class BackOrNext {
	public static void backOrNext(int id) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Enter 1 for Go back");
		System.out.println("Enter 2 for Veg Odering");
		System.out.println("Enter 3 for Non Veg Ordering:");
		
		System.out.println("Enter Option:");
		int n=sc.nextInt();
		OrderFood orderFood=new OrderFood();
		if(n==1) {
			ListMenus.listMenu(id);
		}
		else if(n==2) {
			orderFood.foodOderingVeg(id);
		}else if(n==3) {
			orderFood.foodOderingNonVeg(id);
			
			
		}
		
	}
}
