package com.telusko.learn.objmethod;

import java.util.List;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		ProductService service = new ProductService();

		service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
		service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
		service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
		service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2026));
		service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
		service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
		service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2024));
		service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
		service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
		service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
		service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
		service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2025));
		service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
		service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2027));
		service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

		System.out.println("\n List all products\n");
		List<Product> products = service.getAllProducts();
		service.displayList(products);
		/*
		 * for (Product p : products) { System.out.println(p); }
		 */

		System.out.println("\n get particular product\n");

		List<Product> products3 = service.getProduct("BlackBeast");
		service.displayList(products3);
		/*
		 * for (Product p : products3) { System.out.println(p); }
		 */

		System.out.println("\nget list of products contains the text\n");

		List<Product> products4 = service.getProductWithText("shelf");
		service.displayList(products4);
		/*
		 * for (Product p : products4) { System.out.println(p); }
		 */

		System.out.println("\n get list of products by location\n");

		List<Product> products2 = service.getProductWithPlace("black table");
		service.displayList(products2);

		System.out.println("\nget list of products Out of Warranty\n");

		List<Product> products1 = service.getProductWithOutOfWarranty(Calendar.getInstance().get(Calendar.YEAR));
		service.displayList(products1);

	}
}
