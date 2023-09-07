package com.jeyavel.day2;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values "); 
		int  num = sc.nextInt();
		int temp = num;
		while(num!=1) {
			temp *= num-1;
			num--;
		} 
		System.out.print(temp);

}
}