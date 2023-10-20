package com.mahesh.core_java_day_02;

public class Biggest_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Biggest Among Three Numbers");
		System.out.println("Value 01 : "+args[0]);
		System.out.println("Value 02 : "+args[1]);
		System.out.println("Value 03 : "+args[2]);
		int val1=Integer.parseInt(args[0]);
		int val2=Integer.parseInt(args[1]);
		int val3=Integer.parseInt(args[2]);
		if(val1>val2 && val1>val3)
		{
			System.out.println(val1+" is biggest of all two numbers");
		}
		if(val2>val3 && val2>val1)
		{
			System.out.println(val2+" is biggest of all two numbers");
		}
		else
		{
			System.out.println(val3+" is biggest of all two numbers");
		}
	}

}
