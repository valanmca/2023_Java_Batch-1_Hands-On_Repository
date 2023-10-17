package com.core.day_03;

import java.util.ArrayList;
import java.util.Scanner;

/*Write a Java program to create a class called "Movie" with attributes for title,
 *  director, actors, and reviews, and methods for adding and retrieving reviews.*/

class Movie{
	
	
	Scanner sc=new Scanner (System.in);
	
     String  title;
     
	String director;
	String actor;
	ArrayList<String> review=new ArrayList<String>();
	int n;
	
	void display()
	{
		System.out.println("Enter movie name :");
		title=sc.next();
		System.out.println("Enter director name:");
		director=sc.next();
		System.out.println("Enter actor name:");
		actor=sc.next();
		
		System.out.println();
		System.out.println("Movie details :");
		System.out.println();
		System.out.println("Movie Name : "+title);
		System.out.println("Movie Director : "+director);
		System.out.println("Actor : "+actor);
	}
	
	
	void add_review()
	{
		System.out.println();
		System.out.println("Enter how many person  want to add reviews:");
		 n=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the person "+(i+1)+" review:");
			review.add(sc.next());
		}
	}
	
	
	
	
	void show_review()
	{
				System.out.println("Review:"+review);
		
		
	}
	
}
public class Ass_2 {

	public static void main(String[] args) {
		Movie obj=new Movie();
		obj.display();
		obj.add_review();
		obj.show_review();
		

	}

}
