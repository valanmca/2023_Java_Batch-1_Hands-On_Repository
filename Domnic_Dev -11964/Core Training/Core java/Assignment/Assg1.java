package Core_Topic_Domnic_Day_2;
import java.util.Scanner;
//1. Write a Java program to find the sum of the first 10 prime numbers

public class Assg1 {

	public static void main(String[] args) {
        int n=0,i=1,j;
        int sum=0;
        
        while (n<10)
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
         n++;
         }
         i++;
        }
        
        System.out.println("Sum of first 10 prime numbers is "+sum);

    }

}
