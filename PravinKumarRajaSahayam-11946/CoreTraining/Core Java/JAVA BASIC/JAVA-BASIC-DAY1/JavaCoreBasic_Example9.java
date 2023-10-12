
//6.Write a Java program to find the biggest of the given three numbers using Command Line Arguments.
import java.util.Scanner;
import java.lang.String;
import java.util.*;
import java.io.*;

public class JavaCoreBasic_Example9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number1;
		String number2;
		String number3;
		System.out.println("Arguments 1" + " " + args[0]);
		System.out.println("Arguments 2" + " " + args[1]);
		System.out.println("Arguments 3" + " " + args[2]);
		number1 = args[0];
		number2 = args[1];
		number3 = args[2];
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int g = Integer.parseInt(args[2]);
		if (i >= j && i >= g) {
			System.out.println(number1 + " " + "is a largest number");
		} else if (j >= i && j >= g) {
			System.out.println(number2 + " " + "is a largest number");
		} else {
			System.out.println(number3 + " " + "is a largest number");
		}
	}
}
