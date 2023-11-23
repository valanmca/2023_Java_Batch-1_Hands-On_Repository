package Day5;
import java.util.Scanner;

///Digit Count
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		
		int count=0;// Integer Value Store in Count with 0
		int temp=10;

		while(num>0) {
			num/=temp;
			count++;
			
		}
			System.out.println("Length of Given number:"+count);
		}
		
	}


