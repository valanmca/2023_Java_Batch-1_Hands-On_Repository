package com.pravinkumar.day2;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList_Exs_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList <Integer> list = new LinkedList <Integer>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numbers:");
    int Temp = sc.nextInt();
    int sum=0;
    for(int i=0;i<Temp;i++)
    {
    	int lists = sc.nextInt();
    	list.add(lists);
    }
    System.out.println("The Lists is: " + list);
    for(int i=0;i<list.size();i++)
    {
     	sum += Temp;
    }
    System.out.println("The Sum is : " + sum);
	}

}
