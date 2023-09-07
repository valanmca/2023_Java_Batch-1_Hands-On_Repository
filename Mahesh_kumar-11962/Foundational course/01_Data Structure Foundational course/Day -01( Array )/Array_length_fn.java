package com.mahesh.ds_day1;
import java.util.Scanner;

public class Array_length_fn 
{
	public static void main(String[] args) {
		String value;
		int count=0;
		Scanner sc_ob =new Scanner(System.in);
		System.out.print("     *** Find the  String Length ***\n");
		System.out.println("Enter the string : ");
		value=sc_ob.next();
			   
		char char_array[]=value.toCharArray();
		int i=0;
		while(i<char_array.length)
		{
			count++;
			i++;
		}
		
		System.out.print("\nOutput:\n\tTotal character is : "+count);
		
		System.out.print("\n\tUsing length() function : "+value.length());
		
		System.out.println("\n\n *** Find the Digit length ***");
		System.out.println("\nEnter digit value : ");
		long digit = sc_ob.nextLong();
		int increment=0;
		
		while(digit!=0)
		{
			digit =digit/10;
			System.out.print("\nResult : "+digit+" ");
			increment++;	
		}
		System.out.println("\nOutput for digit : "+increment);
	}
}
