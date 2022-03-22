
package com.foodapp.search.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodapp.model.Menu;
import com.foodapp.util.ConnectionUtil;

public class MenuSearchDAOImpl implements MenuSearchDAO {
	// select * from Food_Ordering_App_Menus;
	@Override
	public List<Menu> findAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Menu> menuList = new ArrayList<Menu>();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		connection = ConnectionUtil.getConnection();
		String sql = "select id,Veg_dishes,Veg_Dishes_price,Non_Veg_dishes,Non_Veg_dishes_price from Food_Ordering_App_Menus";
		statement = connection.prepareStatement(sql);
		rs = statement.executeQuery();
		while (rs.next()) {
			Integer id = rs.getInt("id");
			String vegDishes = rs.getString("Veg_dishes");
			Integer vegDishesPrice = rs.getInt("Veg_Dishes_Price");
			String nonVegDishes = rs.getString("Non_Veg_dishes");
			Integer nonVegDishesPrice = rs.getInt("Non_Veg_dishes_price");

			Menu menuObj = new Menu();
			menuObj.setId(id);
			menuObj.setVegDishes(vegDishes);
			menuObj.setVegDishesPrice(vegDishesPrice);
			menuObj.setNonVegDishes(nonVegDishes);
			menuObj.setNonVegDishesPrice(nonVegDishesPrice);

			menuList.add(menuObj);

		}
		return menuList;

	}

	@Override
	public Menu findById(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		Menu menuObj =null;
		connection = ConnectionUtil.getConnection();
		String sql="select * from Food_Ordering_App_Menus where id=?";
		statement=connection.prepareStatement(sql);
		statement.setInt(1,id);
		rs=statement.executeQuery();
		if(rs.next()) {
			Integer menuId = rs.getInt("id");
			String vegDishe = rs.getString("Veg_dishes");
			Integer vegDishesPrice = rs.getInt("Veg_Dishes_Price");
			String nonVegDishes = rs.getString("Non_Veg_dishes");
			Integer nonVegDishesPrice = rs.getInt("Non_Veg_dishes_price");

			menuObj = new Menu();
			menuObj.setId(menuId);
			menuObj.setVegDishes(vegDishe);
			menuObj.setVegDishesPrice(vegDishesPrice);
			menuObj.setNonVegDishes(nonVegDishes);
			menuObj.setNonVegDishesPrice(nonVegDishesPrice);
		}
		return menuObj;
	}

	@Override
	public Menu findByVegDishes(String vegDishes) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		Menu menuObj =null;
		connection = ConnectionUtil.getConnection();
		String sql="SELECT Veg_dishes,Veg_Dishes_price FROM Food_Ordering_App_Menus WHERE Veg_dishes=?";
		statement=connection.prepareStatement(sql);
		statement.setString(1,vegDishes);
		rs=statement.executeQuery();
		if(rs.next()) {
			String vegDishe = rs.getString("Veg_dishes");
			Integer vegDishesPrice = rs.getInt("Veg_Dishes_Price");

			menuObj = new Menu();

			menuObj.setVegDishes(vegDishe);
			menuObj.setVegDishesPrice(vegDishesPrice);
			
		}
		return menuObj;
	}

	@Override
	public Menu findByNonVegDishes(String nonVegDishes) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		Menu menuObj =null;
		connection = ConnectionUtil.getConnection();
		String sql="SELECT Non_Veg_dishes,Non_Veg_dishes_price FROM Food_Ordering_App_Menus Where Non_Veg_dishes=?";
		statement=connection.prepareStatement(sql);
		statement.setString(1,nonVegDishes);
		rs=statement.executeQuery();
		if(rs.next()) {
			
			String nonVegDishe = rs.getString("Non_Veg_dishes");
			Integer nonVegDishesPrice = rs.getInt("Non_Veg_dishes_price");

			menuObj = new Menu();
			menuObj.setNonVegDishes(nonVegDishe);
			menuObj.setNonVegDishesPrice(nonVegDishesPrice);
		}
		return menuObj;
	}

	@Override
	public int count() throws SQLException {
		Integer count=null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		connection = ConnectionUtil.getConnection();
		String sql="select count(*) AS cnt from Food_Ordering_App_Menus";
		statement=connection.prepareStatement(sql);
		rs=statement.executeQuery();
		if(rs.next()) {
			count = rs.getInt("cnt");
		}
		return count;
	}

	@Override
	public List<Menu> displayVegDishes() throws SQLException {
		// TODO Auto-generated method stub
				List<Menu> menuList = new ArrayList<Menu>();
				Connection connection = null;
				PreparedStatement statement = null;
				ResultSet rs = null;

				connection = ConnectionUtil.getConnection();
				String sql = "select Veg_dishes,Veg_Dishes_price from Food_Ordering_App_Menus";
				statement = connection.prepareStatement(sql);
				rs = statement.executeQuery();
				while (rs.next()) {
					String vegDishes = rs.getString("Veg_dishes");
					Integer vegDishesPrice = rs.getInt("Veg_Dishes_Price");
									
					
					Menu menuObj = new Menu();

					menuObj.setVegDishes(vegDishes);
					menuObj.setVegDishesPrice(vegDishesPrice);
					

					menuList.add(menuObj);

				}
				return menuList;

	}
}
