package DataStructureDay2;

import java.util.Scanner;

public class avgarray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark[]=new int[3];
         
        
		System.out.println("Enter the Student Id:");
		int sId = sc.nextInt();
		
		System .out.println("Enter the Studengt name:");
		String sName = sc.next();
		
		System.out.print("Enter Three subject Marks:" );
		for(int i=0; i<mark.length; i++) {
        	mark[i]=sc.nextInt();
        }
		
		int sum=0;
		for( int i=0; i<mark.length; i++) {
			 sum=sum+mark[i];	
		}
        
		int avg = sum/3;
	
		System.out.println("Student Id:" + sId);
		System.out.println("Student Name:" + sName);
		for(int i=0; i<mark.length; i++) {
			System.out.println("Mark" +(i+1) +"is:" + mark[i]);
		}
		System.out.println("Todal Marks:" + sum);
		System.out.println("Average :" + avg);
	}

		// TODO Auto-generated method stub

	}

