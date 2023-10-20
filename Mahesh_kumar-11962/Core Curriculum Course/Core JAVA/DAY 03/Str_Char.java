package com.mahesh.core_java_day_03;

public class Str_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "JAVA PROGRAM";
		char char_arr[] = s1.toCharArray();
		for(char i :char_arr)
		{
			System.out.println(i);
		}
		
		String s2 = "Welcome to java programming";
		String str[] = s2.split(" ");
		for(String s_index:str)
		{
			System.out.println(s_index);
		}
		
		String str1[] = s2.split("p");
		for(String s_index:str1)
		{
			System.out.println(s_index);
		}
	}

}
