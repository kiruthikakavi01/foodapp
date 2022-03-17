package com.foodapp.menu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.foodapp.model.Menu;

public class MenuDAOImpl implements MenuDAO {
	
	Connection statement;
	Connection connection;
	/*This method is to get connection*/
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String username = "rev_user";
		String password = "rev_user";
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection);
		return connection;
		
	}
	/*this method is to close connection*/
	public Connection closeConnection() throws SQLException {
		
		statement.close();
		connection.close();
		return null;
		
	}
	/*This method is to add Menus
	 * */
	public void menuAdd(Menu menu) throws ClassNotFoundException, SQLException {
		
		String sql = "INSERT INTO Food_Ordering_App_Menus (Veg_dishes,Veg_Dishes_price,Non_Veg_dishes,Non_Veg_dishes_price)VALUES(?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, menu.getVegDishes());
		pst.setInt(2, menu.getVegDishesPrice());
		pst.setString(3, menu.getNonVegDishes());
		pst.setInt(4, menu.getNonVegDishesPrice());
		System.out.println(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted:" + rows);
		
	}

	/*This method is used to update menus
	 * */
	
	public void menuUpdate(Menu menu) throws ClassNotFoundException, SQLException {
		getConnection();
		String sql = "UPDATE Food_Ordering_App_Menus SET Veg_Dishes_price="+menu.getVegDishesPrice()+"Where Veg_dishes='"+menu.getVegDishes();
	    Statement  statement = connection.createStatement();
		System.out.println(sql);
		int rows = statement.executeUpdate(sql);
		System.out.println("No of rows Update:" + rows);
		closeConnection();
		
	}
	

}
