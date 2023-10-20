package com.jeban.Assignment2;

import java.util.ArrayList;

class Restaurant{
	ArrayList <String> Menu=new ArrayList <String>();
	ArrayList <Integer> Price=new ArrayList <Integer>();
	ArrayList <Float> Rating=new ArrayList <Float>();
	float avg_rating;
	
	void add_items(String menu,int price,float rating) {
		Menu.add(menu);
		Price.add(price);
		Rating.add(rating);
	}
	void remove_items(String menu,int price,float rating) {
		Menu.remove(menu);
		Price.remove(price);
		Rating.remove(rating);
	}
	void display() {
		System.out.println("List of details:"+Menu+Price+Rating);
	}
	
	void avg()
	{
		int count =0;
		for(float obj : Rating )
		{
			
			avg_rating = (obj+avg_rating);
			count++;
		}
		System.out.println("Average rating : "+(avg_rating/count));
	}
}

public class Restaurants {

	public static void main(String[] args) {
		Restaurant obj=new Restaurant();
		obj.add_items("Dosa", 50, 5.0f);
		obj.add_items("Idly", 8, 5.0f);
		obj.add_items("Parrota", 14, 5.0f);
		obj.display();
		obj.avg();
		
		

	}

}
