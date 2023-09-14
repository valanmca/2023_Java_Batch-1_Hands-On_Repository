package com.mahesh.ds_day1;

public class Mark_Display {
	public static void main(String[] arge)
	{
		int mark1=30,mark2=60,mark3=80;
		String Uname ="Mahesh";
		String Empid = "11962@relevantz";
		
		int sum_three_values = mark1+mark2+mark3;
		int average = sum_three_values/3;
		
		System.out.println("User name:"+Uname+"\n");
		System.out.println("User id:"+Empid+"\n");
		System.out.println( "Mark1 : "+mark1);
		System.out.println( "Mark2 : "+mark2);
		System.out.println( "Mark3 : "+mark3);
		System.out.println( "\nMark1+Mark2+Mark3 : "+sum_three_values+"\n");
		System.out.println("Average Mark : "+average+"\n");
		
	}

}
