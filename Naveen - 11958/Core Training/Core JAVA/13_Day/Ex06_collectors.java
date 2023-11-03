//package com.naveen.day_13;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Ex06_collectors {
//
//	public static void main(String[] args) {
//
// 
//        List<Product> productsList = new ArrayLissssssssssssssssssssssssst<Product>();  
//        //Adding Products  
//        productsList.add(new Product(1,"HP Laptop",25000f));  
//        productsList.add(new Product(2,"Dell Laptop",30000f));  
//        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
//        productsList.add(new Product(4,"Sony Laptop",28000f));  
//        productsList.add(new Product(5,"Apple Laptop",90000f));  
//        List<Float> productPriceList =   
//                productsList.stream()  
//                            .map(x->x.price)         // fetching price  
//                            .collect(Collectors.toList());  // collecting as list  
//        System.out.println(productPriceList);  
//    }  
//}  
//
//
