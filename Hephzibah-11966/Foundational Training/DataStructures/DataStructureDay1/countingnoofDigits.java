package DataStructureDay1;

import java.util.Scanner;
import java.util.LinkedList;
public class countingnoofDigits {

	public static void main(String[] args) {
		LinkedList<Integer> list1= new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a size: ");
		int s=sc.nextInt();
		System.out.println("enter the digits:");
		for(int i=0; i<s; i++)
		{
			int num=sc.nextInt();
			list1.add(num);
		}
		System.out.println("the list is: " +list1);
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.print("no of digit in number is:" + count);
		
	}

}
