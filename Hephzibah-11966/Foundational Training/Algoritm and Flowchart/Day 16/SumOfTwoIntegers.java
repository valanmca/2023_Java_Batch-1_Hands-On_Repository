package integers;

import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 : " +num1 +"\nnum2 : " +num2);
		sum=num1+num2;
		System.out.println("Sum of two Integers :" +sum);
		
	}

}
