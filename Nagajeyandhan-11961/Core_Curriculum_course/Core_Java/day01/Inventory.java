package com.jeyandhan.day01;
import java.util.ArrayList;
public class Inventory {

	String productName;
	int quantity;
	
	ArrayList <Inventory> products;
	
	Inventory(String productName, int quantity){
		this.productName = productName;
		this.quantity = quantity;
		this.products = new ArrayList <Inventory>();
	}
	
	void addProducts(Inventory product) {
		products.add(product);
	}
	
	void removeProducts(Inventory product) {
		products.remove(product);
	}
	
	void prdctDisplay() {
		System.out.println(products);
	}
	
	void checkLowInventory() {
		for(Inventory product:products) {
			if(product.quantity <= 100) {
				System.out.println(product.productName+" is running low on inventory. Current Quantity: "+product.quantity);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Inventory product1 = new Inventory("Tv",5);
		
		product1.addProducts(product1);
		
		
		product1.prdctDisplay();
		

	}

}
