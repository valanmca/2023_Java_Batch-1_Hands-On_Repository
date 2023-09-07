package DataStructureDay1;

import java.util.Scanner;

public class arithmetic {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two variables:");
		System.out.println("Enter the a value:");
		int a = sc.nextInt();
		System.out.println("Enter the b value:");
		int b = sc.nextInt();
		
		int sum=a+b;
		int dif=a-b;
		int mul=a*b;
		int div=a/b;
		
		System.out.println("sum of two variables:" + sum);
		System.out.println("difference of two variables:" + dif);
		System.out.println("multiples of two variables:" + mul);
		System.out.println("division of two variables:" + div);
	}

}
