package com.telusko.learn.db;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	List<Product> products = new ArrayList<>();
	ProductDB db = new ProductDB();

	public void addProduct(Product p) {
		// products.add(p);
		db.save(p);
	}

	public List<Product> getAllProducts() {
		// return products;
		return db.getAll();
	}

	public List<Product> getProduct(String name) {
		return db.getProductByName(name);

		/*
		 * for (Product p : products) { if (p.getName().equals(name)) prods.add(p); }
		 * return prods;
		 */
	}

	public List<Product> getProductWithText(String text) {
		return db.getProductWithText(text);

		/*
		 * String str = text.toLowerCase(); List<Product> prods = new ArrayList<>(); //
		 * mmmmmmmmmmmmmmmmmmmmmmmmm b for (Product p : products) { String name =
		 * p.getName().toLowerCase(); String type = p.getType().toLowerCase(); String
		 * place = p.getPlace().toLowerCase(); if (name.contains(str) ||
		 * type.contains(str) || place.contains(str)) prods.add(p); } return prods;
		 */
	}

	public List<Product> getProductWithPlace(String text) {

		return db.getProductWithPlace(text);

		/*
		 * String str = text.toLowerCase(); List<Product> prods = new ArrayList<>(); //
		 * mmmmmmmmmmmmmmmmmmmmmmmmm b for (Product p : products) { String place =
		 * p.getPlace().toLowerCase(); if (place.contains(str)) prods.add(p); } return
		 * prods;
		 */
	}

	public List<Product> getProductWithOutOfWarranty(int year) {

		return db.getProductWithOutOfWarranty(year);

		/*
		 * directly fetching from the object list created and stored from Main
		 * List<Product> prods = new ArrayList<>();
		 * 
		 * // mmmmmmmmmmmmmmmmmmmmmmmmm b for (Product p : products) { if
		 * (p.getWarranty() < year) prods.add(p); } return prods;
		 */

	}

	public void displayList(List<Product> product) {
		for (Product p : product) {
			System.out.println(p);
		}
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		db.closeConnection();
		
	}
}
