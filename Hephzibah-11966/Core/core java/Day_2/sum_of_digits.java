package Java_Basics;
import java.util.Scanner;
public class sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int num,sum=0,n;
		System.out.println("enter the number");
		num = sc.nextInt();  
		while(num>0) {
			n=num%10;
			sum=sum+n;
			num=num/10;			
		}
		System.out.println("Sum of Digits:"+sum);
		

	}

}
