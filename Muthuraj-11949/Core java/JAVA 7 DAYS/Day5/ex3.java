package Day5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// Reverse of Numbers
public class ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		int arraylist;
		
		System.out.println("Before the arraylist :"+list);   
		Collections.reverse(list);
		System.out.println("After the arraylist:"+list);
		
		
         Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=0;
		int reverse=0;
		if(i>0) {
			reverse=reverse/10;
		}
		
             System.out.println("The Revere of Numebr:"+num);
	}
}


