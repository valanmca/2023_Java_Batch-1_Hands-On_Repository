//Multiplying the Programs
package com.pravinkumar.day2;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList_Exs_2 {

	private static final Integer Mutiply1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList <Integer> List1=new LinkedList<Integer>();
    LinkedList <Integer> List2=new LinkedList<Integer>();
    Scanner sc=new Scanner(System.in);
    int num;
    //For adding number in LinkedList using the for loop programs
    for(int i=0;i<=10;i++)
    {
        List1.add(i);
  	}
    System.out.println("The List 1 is: " + List1);
    System.out.println("Enter a Number:");
    num=sc.nextInt();
    //For Multiplying with the above Statement
    for(int i=0;i<List1.size();i++)
    {
         List2.add(List1.get(i)*num);
    }
    	System.out.println("Multiply with 5 is: " + List2);
	for(int i=0;i<=10;i++)
	{
	System.out.println(List1.get(i) +"*"+num+"="+List2.get(i));
	}
}
}
