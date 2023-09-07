//The Simple Calculator Programs in java
package com.pravinkumar.day1;
import java.util.Scanner;
public class Array_Exs_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Symbols;
		int Number1;
		int Number2;
		
		//For Store Temporavery Variable use for that declares any values for its
		int Number3 = 0;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the Symbols use want'+,-,*,/,%':");
    
    //For Save thes user Input for Symbols use sc.next().charAt(0);
    Number3=sc.next().charAt(0);
    
    System.out.println("Enter the Number1:");
    Number1=sc.nextInt();
    
    System.out.println("Enter the Number2:");
    Number2=sc.nextInt();
    
    switch(Number3) {
    case '+':
        Number3=Number1+Number2;
        System.out.println("The Addition is: " + Number3);
        break;
        
    case '-':
    	Number3=Number1-Number2;
    	System.out.println("The substraction is: " + Number3);
    	break;
    case '*':
    	Number3=Number1*Number2;
    	System.out.println("The Multiplication is : " + Number3);
    	break;
    case '/':
    	Number3=Number1/Number2;
    	System.out.println("The Division is: " + Number3);
    	break;
    case '%':
    	Number3=Number1%Number2;
    	System.out.println("The Modulos is : " + Number3 );
    	break;
    }
	}

}
