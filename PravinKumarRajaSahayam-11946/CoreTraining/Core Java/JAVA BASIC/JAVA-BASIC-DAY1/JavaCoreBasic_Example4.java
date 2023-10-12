//1.Write a Java program to find the sum of the first 10 prime numbers.
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class JavaCoreBasic_Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner sc=new Scanner(System.in);
		    int number = 10,sum=0,i=1,j;
		    /*number=sc.nextInt();*/
		    int t=number;
		    while(number!=0)
		    {
		      int count=0;
		      for(j=1;j<=i;j++)
		      {
		        if(i%j==0)
		        {
		          count++;
		        }
		      }
		      if(count==2)
		      {
		        sum=sum+i;
		        number--;
		      }
		      i++;
		    }
System.out.println( "Sum of the First" + " " + t + " " + "prime number is" + " " + sum);

	}
}
