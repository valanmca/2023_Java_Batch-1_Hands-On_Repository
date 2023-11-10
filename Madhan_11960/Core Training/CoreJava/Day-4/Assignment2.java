package com.madhan.coreday4;
import java.util.ArrayList;
import java.util.Scanner;

class Movie
{
	String title;
	String director;
	String actors;
	
	ArrayList<String> review=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
	Movie(String title,String director,String actors)
	{
		this.title=title;
		this.director=director;
		this.actors=actors;
	
	}
	
	void addreview()
	{
		System.out.println("Enter your review for :"+title);
		review.add(sc.next());
	}
	
	void display()
	{
		System.out.println("Movie:"+title);
		System.out.println("Director:"+director);
		System.out.println("Actor:"+actors);
		System.out.println("Reviews:"+review);
	}
	
}

public class Assignment2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Movie obj = new Movie("Master", "Lokesh", "Vijay");

        char choice;
        do {
            System.out.println("1.Add Review/n 2.View Review");
            int input = sc.nextInt();
            if (input == 1) {
                obj.addreview();
            } else {
                obj.display();
            }
            System.out.println("Do you want to Contiue (y/n)");
             choice = sc.next().charAt(0);
        } while (choice == 'y'|| choice =='Y');
    }

}


