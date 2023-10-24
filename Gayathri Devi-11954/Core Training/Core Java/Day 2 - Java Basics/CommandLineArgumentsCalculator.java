package com.gayathri.day2;

public class CommandLineArgumentsCalculator {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println("Argument 1 : "+args[0]);
		System.out.println("Argument 2 : "+args[1]);
		System.out.println("+  : "+(n1+n2));
		System.out.println("-  : "+(n1-n2));
		System.out.println("*  : "+(n1*n2));
		System.out.println("/  : "+(n1/n2));
		System.out.println("%  : "+(n1%n2));

	}

}
