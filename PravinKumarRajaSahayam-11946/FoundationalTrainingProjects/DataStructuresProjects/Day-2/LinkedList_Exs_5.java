//Factorial Programs in Java
package com.pravinkumar.day2;
import java.util.Scanner;
public class LinkedList_Exs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Numbers:");
    int Numbers=sc.nextInt();
    int fact=1;
    for(int i=1;i<Numbers+1;i++)
    {
    	fact *= i;
    }
    System.out.println("The Factorial are: " + fact);
	}

}
