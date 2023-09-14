
//average of the student marks
package com.jeyavel.day2;
import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		int marks[] = new int[3];
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the student id ");
		int sId = sc.nextInt();
		
		System.out.println("Enter the student Name :");
		String sname = sc.next();
		
		System.out.println("Enter the 3 subject Marks :");
		
	    for(int i=0;i<marks.length;i++) {
	      marks[i]=sc.nextInt();
	     }
	     
	     int sum = 0;
	     for(int i=0;i<marks.length;i++) {
	    	 sum= sum+marks[i];
	     }
	     int avg = sum/3;
		
		
		System.out.println("Enter the student ID   :" + sId);
		System.out.println("Enter the student Name :" + sname );
		for(int i=0;i<marks.length;i++) {  
			System.out.println("Marks" + (i+1)+":"+marks[i]);
		}
		System.out.println("Enter the student Total:" + sum);
		System.out.println("Enter the student AVG  :" + avg);



	}

}






	
		
		

