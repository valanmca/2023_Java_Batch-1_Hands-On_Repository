package com.pravinkumar.day2;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList_Exs_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList <Integer> list = new LinkedList<Integer>();
    System.out.println("Enter the List:");
    Scanner sc=new Scanner(System.in);

int listSize = sc.nextInt();
for(int i=0;i<listSize;i++)
{
	int temp = sc.nextInt();
	list.add(temp);
}
System.out.println("List: " + list);
for(int i=0;i<listSize;i++)
{
	int num = list.get(i);
	int count = 0;
	while( num != 0)
	{
		num /= 10;
		count++;
	}
	System.out.println("Total no.of.digits.in :" + list.get(i) + ":" + count);
}
}
}