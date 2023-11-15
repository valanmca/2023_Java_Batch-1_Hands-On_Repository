package com.shiva.core.day13;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Collector_Demo {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(1, "HP Laptop", 25000f));
		productList.add(new Product(2, "Dell Laptop", 30000f));
		productList.add(new Product(3, "Apple Laptop", 125000f));

		Long productcountList = productList.stream().map(x -> x.name).collect(Collectors.counting());

		List<Float> productPriceList = productList.stream().map(x -> x.price).collect(Collectors.toList());

		// To display the product count List
		System.out.println("Total no of Products : " + productcountList);

		// To display the price list
		System.out.println(productPriceList);
	}

}
