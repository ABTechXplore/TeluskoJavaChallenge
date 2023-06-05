package com.telusko.learn.objmethod;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	List<Product> products = new ArrayList<>();
	List<Product> prods = null;

	public void addProduct(Product p) {
		products.add(p);
	}

	public List<Product> getAllProducts() {
		return products;
	}

	public List<Product> getProduct(String name) {
		prods = new ArrayList<>();
		for (Product p : products) {
			if (p.getName().equals(name))
				prods.add(p);
		}
		return prods;

	}

	public List<Product> getProductWithText(String text) {
		prods = new ArrayList<>();
		String str = text.toLowerCase();
		// mmmmmmmmmmmmmmmmmmmmmmmmm b
		for (Product p : products) {
			String name = p.getName().toLowerCase();
			String type = p.getType().toLowerCase();
			String place = p.getPlace().toLowerCase();
			if (name.contains(str) || type.contains(str) || place.contains(str))
				prods.add(p);
		}
		return prods;

	}

	public List<Product> getProductWithPlace(String text) {
		prods = new ArrayList<>();
		String str = text.toLowerCase();
		// mmmmmmmmmmmmmmmmmmmmmmmmm b
		for (Product p : products) {
			String place = p.getPlace().toLowerCase();
			if (place.contains(str))
				prods.add(p);
		}
		return prods;

	}

	public List<Product> getProductWithOutOfWarranty(int year) {

		// directly fetching from the object list created and stored from Main
		prods = new ArrayList<>();
		// mmmmmmmmmmmmmmmmmmmmmmmmm b
		for (Product p : products) {
			if (p.getWarranty() < year)
				prods.add(p);
		}
		return prods;

	}

	public void displayList(List<Product> product) {
		for (Product p : product) {
			System.out.println(p);
		}
	}
}
