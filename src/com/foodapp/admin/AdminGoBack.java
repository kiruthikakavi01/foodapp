package com.foodapp.admin;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminGoBack {
	public static void goBack() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Go Back :");
		System.out.println("Enter 2 for To exist page");
		int n=sc.nextInt();
		if(n==1) {
			AdminUpdates.adminUpdate();
		}else if(n==2) {
			System.out.println("Thanks for coming.... ");
		}
	}
}
