package Day5;

import java.util.Scanner;
////Factorial Concept
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the number:");
		
      	int i=0;
		int fact=10;
		
		for(i=0;i>0;i++)
		{
			fact=num*i;
		}
		System.out.println("Factorial:"+fact);
	}

}
