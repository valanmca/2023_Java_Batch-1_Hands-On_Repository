package com.pravinkumar.day2;
import java.util.Scanner;
public class Array_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int EEMPLOYEES[]=new int[3];
		int EID;
		int ENAME;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the Employees Id:");
    EID=sc.nextInt();
    
    System.out.println("Enter the Employees Name:");
    ENAME=sc.nextInt();
    
    System.out.println("Enter the Three Marks foe the Employees:");
    for(int i=0;i<EEMPLOYEES.length;i++)
    {
    	EEMPLOYEES[i]=sc.nextInt();
    }
    
    int sum=0;
    System.out.println("The Sum is:");
    for(int i=0;i<EEMPLOYEES.length;i++)
    {
    	sum=sum+EEMPLOYEES[i];
    }
    int avg=sum/3;
    System.out.println("EID :" + EID);
    System.out.println("ENAME : " + ENAME);
    for(int i=0;i<EEMPLOYEES.length;i++)
    {
    	System.out.println("EEMPLOYEES" + (i+1) + EEMPLOYEES[i]);
    }
    System.out.println("The Sum is: " + sum);
    System.out.println("The Average is: " + avg);
    
	}

}
