package com.telusko.learn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

	Connection con = null;
	List<Product> prods = new ArrayList<>();

	public ProductDB() {
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TeluskoDemo", "postgres", "ABdb");
			System.out.println("Connection to DB established");

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void save(Product p) {
		String query = "insert into product (name,type,place,warranty) values(?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, p.getName());
			st.setString(2, p.getType());
			st.setString(3, p.getPlace());
			st.setInt(4, p.getWarranty());
			st.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Product> getAll() {
		String query = "select * from product";
		prods = getQueryDB(query);
		return prods;
	}

	public List<Product> getProductWithOutOfWarranty(int year) {
		String query = "select * from product where warranty < " + year;
		prods = getQueryDB(query);
		return prods;
	}

	public List<Product> getProductWithPlace(String text) {
		String query = "select * from product where place ilike '" + text + "'";
		prods = getQueryDB(query);
		return prods;
	}

	public List<Product> getQueryDB(String query) {
		prods.clear();
		try {
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setName(rs.getString(2));
				p.setType(rs.getString(3));
				p.setPlace(rs.getString(4));
				p.setWarranty(rs.getInt(5));
				prods.add(p);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return prods;
	}

	public List<Product> getProductByName(String name) {
		String query = "select * from product where name = '" + name + "'";
		prods = getQueryDB(query);
		return prods;
	}

	public List<Product> getProductWithText(String text) {

		String query = "select * from product where name || place || type ilike '%" + text + "%'";
		prods = getQueryDB(query);
		return prods;
	}

	public void openConnection() {
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TeluskoDemo", "postgres", "ABdb");
			System.out.println("Connection to DB established");

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
