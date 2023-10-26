package com.gayathri.day8Exception;
import java.util.Scanner;

class InvalidAgeException extends Exception{

	@Override
	public String toString() {
		return "Not eligible";
	}
	
	
}
public class SampleThowable12 {


	public static void main(String[] args) {
		System.out.println("ENter your age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>18)
			System.out.println("Eligible for vote");
		else {
			try {
				throw new InvalidAgeException();					
			}
			catch(Throwable e) {
				System.out.println(e);
			}
		}
sc.close();
	}

}
