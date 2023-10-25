
//Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, 
//and methods for adding and retrieving reviews.
package com.shiva.core.day03;

import java.util.Scanner;
import java.util.ArrayList;

class Movie {
	String Title;
	String Director;
	ArrayList<String> Actors=new ArrayList<String>();
	ArrayList<String> Reviews=new ArrayList<String>();
	
	Scanner sc=new Scanner(System.in);
	
	void display() {
		System.out.println("Enter the Movie's Title : ");
		Title=sc.next();
		System.out.println("Enter the Director's Name : ");
		Director=sc.next();
		System.out.println("Enter the Actors Name : ");
		Actors.add(sc.next());
		
		System.out.println("Movie Name : "+Title);
		System.out.println("Movie Director : "+Director);
		System.out.println("Actors Name : "+Actors);
	}
	
	void Add_Review() {
		System.out.println("Enter the No of Reviews to be added :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" Reviews");
			Reviews.add(sc.next());
		}
		System.out.println("The Reviews are : "+Reviews);
	}
}

public class Assign_Movie {

	public static void main(String[] args) {
		Movie obj=new Movie();
		obj.display();
		obj.Add_Review();
	}

}
