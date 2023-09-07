package DataStructureDay1;

import java.util.Scanner;

public class arraysearch {

	public static void main(String[] args) {
		int arr[]= new int[5];
		int flag=0;
		
		System.out.println("Enter " + arr.length +"values");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the x value:");
		int x = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) 
		{
			if (arr[i]==x)
					{
				flag=1;
				System.out.println("the position of " + x +" is "+ i);
				break;
					}
			
			else {
				flag=0;
			     }
				
			}
		   
		if(flag==0) {
			System.out.println("-1");
		}		
		}
}