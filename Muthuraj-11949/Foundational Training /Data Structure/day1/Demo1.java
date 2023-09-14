package com.muthu.day1;
import java.util.*;
public class Demo1 {


	public static void main(String[] args) 
{	
 Scanner sc=new Scanner(System.in);
 
 System.out.println("Student id");
 int sId=sc.nextInt();
 System.out.println("sId:"+sId);
 
 System.out.println("Student name");
 String Name=sc.next();
 System.out.println("Name:"+Name);
 
 System.out.println("student of mark");
 int m1=sc.nextInt();
 int m2=sc.nextInt();
 int m3=sc.nextInt();
 System.out.println("Student mark:"+m1);
 System.out.println("Student mark:"+m2);
 System.out.println("Student mark:"+m3);

 int sum=m1+m2+m3;
 System.out.println("sum:"+sum);
 
	}

}
