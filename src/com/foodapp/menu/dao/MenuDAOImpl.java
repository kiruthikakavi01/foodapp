package com.foodapp.menu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.foodapp.model.Menu;
import com.foodapp.util.ConnectionUtil;

public class MenuDAOImpl implements MenuDAO {
	
	
	
	/*This method is to add Menus
	 * */
	public void menuAdd(Menu menu) throws SQLException, ClassNotFoundException ,NullPointerException{
		Connection connection = null;
		PreparedStatement statement = null;
		int rows=0;
		connection = ConnectionUtil.getConnection();
	    String sql="INSERT INTO Food_Ordering_App_Menus (Veg_dishes,Veg_Dishes_price,Non_Veg_dishes,Non_Veg_dishes_price) VALUES (?,?,?,?)";
	    statement=connection.prepareStatement(sql);
	    statement.setString(1,menu.getVegDishes());
	    statement.setInt(2,menu.getVegDishesPrice());
	    statement.setString(3,menu.getNonVegDishes());
	    statement.setInt(4,menu.getNonVegDishesPrice());
	    System.out.println(sql);
	    rows=statement.executeUpdate();
	    System.out.println("No of rows inserted:"+rows);    		
	}

	/*This method is used to update menus
	 * */
	   public void menuVegUpdate(Menu menu) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		int rows=0;
		connection = ConnectionUtil.getConnection();
		String sql = "UPDATE Food_Ordering_App_Menus SET Veg_Dishes_price= ? Where Veg_dishes= ?";
	    statement = connection.prepareStatement(sql);
	    statement.setInt(1,menu.getVegDishesPrice());
	    statement.setString(2,menu.getVegDishes());
		System.out.println(sql);
		rows = statement.executeUpdate();
		System.out.println("No of rows Update:" + rows);

		
	}

	@Override
	public void menuNonVegUpdate(Menu menu) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		int rows=0;
		connection = ConnectionUtil.getConnection();
		String sql = "UPDATE Food_Ordering_App_Menus SET Non_Veg_dishes_price= ? Where Non_Veg_dishes= ?";
	    statement = connection.prepareStatement(sql);
	    statement.setInt(1,menu.getNonVegDishesPrice());
	    statement.setString(2,menu.getNonVegDishes());
		System.out.println(sql);
		rows = statement.executeUpdate();
		System.out.println("No of rows Update:" + rows);

		
	}

	@Override
	public void menuDelete(Menu menu) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		int rows=0;
		connection = ConnectionUtil.getConnection();
		String sql = "DELETE FROM Food_Ordering_App_Menus WHERE id=?";
	    statement = connection.prepareStatement(sql);
	    statement.setInt(1,menu.getId());
		System.out.println(sql);
		rows = statement.executeUpdate();
		System.out.println("No of rows Deleted:" + rows);
		
	}
	

}
