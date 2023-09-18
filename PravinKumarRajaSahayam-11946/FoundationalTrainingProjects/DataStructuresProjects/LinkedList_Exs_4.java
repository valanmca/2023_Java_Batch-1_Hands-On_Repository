//Find Odd and Even and Stores in the Array list
package com.pravinkumar.day2;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> list=new LinkedList<Integer>();
		LinkedList <Integer> even=new LinkedList<Integer>();
		LinkedList <Integer> odd=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Numbers:");
    int Numbers=sc.nextInt();
    for(int i=0;i<Numbers;i++)
    {
    	int temp=sc.nextInt();
    	list.add(temp);
    }
    for(int i=0;i<list.size();i++)
    {
    if(list.get(i)%2!=0)
    {
    	even.add(i);
    }
    else
    {
    	odd.add(i);
    }
    }
    System.out.println("The Even Is:" + even);
    System.out.println("The Odd Is: " + odd);
	}

}
