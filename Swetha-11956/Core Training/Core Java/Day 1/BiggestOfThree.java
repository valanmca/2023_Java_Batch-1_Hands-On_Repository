//Biggest of three numbers.
package oopsDay1_Day2;
import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {

		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1 +" is the biggest number among three given numbers");
			}
			
		}
		else if(num2>num3) {
			System.out.println(num2 +" is the biggest number among three given numbers");
		}
		else {
			System.out.println(num3 +" is the biggest number among three given numbers");
		}
	}

}
