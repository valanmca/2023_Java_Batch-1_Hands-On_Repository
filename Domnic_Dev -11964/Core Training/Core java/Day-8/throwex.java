package Core_Topic_Domnic_Day_8;
import java.util.Scanner;

public class throwex {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the age");
       int age=sc.nextInt();
       
       if(age<18) {
    	   throw new ArithmeticException("Invalid age");
       }
       
       else {
    	   System.out.println("Valid");
       }
       
	}

}
