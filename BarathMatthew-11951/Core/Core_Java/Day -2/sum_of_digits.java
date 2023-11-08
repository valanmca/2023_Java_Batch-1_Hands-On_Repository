package Java_basic;
import java.util.Scanner;
public class sum_of_digits {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int temp = 0;
		
		while(num!=0) {
			temp += (num%10);
			num/=10;
		}
		System.out.println(temp);
	}

}
