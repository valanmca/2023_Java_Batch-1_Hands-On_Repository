package com.aravind.day9;
import java.util.Scanner;

public class InstanceAndStaicaAdd {
	int a;
    static int b;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InstanceAndStaicaAdd obj=new InstanceAndStaicaAdd();
		 obj.a=sc.nextInt();
		 InstanceAndStaicaAdd.b=sc.nextInt();
		
		
		int c=(obj.a)+(InstanceAndStaicaAdd.b);
		System.out.println(c);
		
		
	}

}
