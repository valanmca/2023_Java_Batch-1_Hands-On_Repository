package com.jeban.Assignment2;

import java.util.ArrayList;

class Movie{
	String Title;
	String Director;
	String Actor;
	ArrayList <String> Review=new ArrayList <String>();
	Movie(String Title,String Director,String Actor){
		this.Title=Title;
		this.Director=Director;
		this.Actor=Actor;
		
		}
	void add_review(String review) {
		
		Review.add(review);
		
	}
	void remove_review(String review) {
		Review.remove(review);
	}
	void display() {
		System.out.println("Title of the Movie:"+Title);
		System.out.println("Director of the Movie:"+Director);
		System.out.println("Actor of the Movie:"+Actor);
		System.out.println("Review of the Movie:"+Review);
		
	}
}

public class Movies {

	public static void main(String[] args) {
		Movie details=new Movie("Jailer","Nelson","Rajini");
		details.add_review("Feel Good Movie");
		details.add_review("Waste of nelson's time with rajini");
		details.add_review("One time wathed movie");
		details.display();
		details.remove_review("Feel Good Movie");
		details.display();
	
		
		

	}

}
