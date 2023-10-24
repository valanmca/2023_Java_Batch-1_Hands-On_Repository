package Core_Topic_Domnic_Day_2;
import java.util.Scanner;
public class Assg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter your number");
     int sum=0;
     int num=sc.nextInt();
     int u_input=num;
     while(num>0) {
    	 int temp;
    	 temp=num%10;
    	 
    	 sum=sum+temp;
    	 
    	 num=num/10;
     }
     
     
     System.out.println("Sum of "+u_input+" is "+sum);
	}

}
