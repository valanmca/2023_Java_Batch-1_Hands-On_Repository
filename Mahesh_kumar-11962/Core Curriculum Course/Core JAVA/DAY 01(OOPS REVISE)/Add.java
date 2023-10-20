package com.mahesh.core_java;



public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Argument 1 : "+args[0]);
		System.out.println("Argument 2 : "+args[1]);
		System.out.println("Total Argument : "+args.length);
                int a= Integer.parseInt(args[0]);
                int b= Integer.parseInt(args[1]);
                System.out.println("Result (A+B) : "+(a+b));
	}

}

