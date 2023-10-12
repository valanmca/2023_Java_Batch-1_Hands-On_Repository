package com.oops;
import java.util.Scanner;
import java.util.ArrayList;

class library{
	
	ArrayList<String> Name=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
	void add_Book()
	{
		
		System.out.println(" No of book want to add:");
		int n=sc.nextInt();
		System.out.println("Enter the book name:");
		for(int i=0;i<n;i++)
		{
			Name.add(sc.next());
		}
		
		System.out.println();
		
	}
	
	void remove_Book()
	{
		System.out.println();
		System.out.println();
		System.out.println(" No of book want to remove:");
		int m=sc.nextInt();
		System.out.println("Enter the book name:");
		for(int i=0;i<m;i++)
		{
			Name.remove(sc.next());
		}
		
		System.out.println();
		
	}
	void show()
	{
		System.out.println("Book Name:");
		System.out.print(Name);
	}
	
}

public class Ass_2 {

	public static void main(String[] args) {
		library obj=new library();
		obj.add_Book();
		obj.show();
		obj.remove_Book();
		obj.show();
		

	}

}
