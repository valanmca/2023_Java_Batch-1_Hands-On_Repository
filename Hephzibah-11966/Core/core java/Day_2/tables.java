package Java_Basics;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,mult;
		System.out.println("Enter the number:");
		num = sc.nextInt();  
		for(int i=1;i<=10;i++) {
			mult=i*num;
			System.out.println(i+"*"+num+"="+mult);
		}

	}

}
