package com.telusko.learn.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class Product {
	private String name;
	private String type;
	private String place;
	private int warranty;

}
