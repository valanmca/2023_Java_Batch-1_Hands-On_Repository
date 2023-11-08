package Java_basic;
import java.util.Scanner;
public class Mul_tables {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp =1;
		for(int i=1;i<=10;i++) {
			temp = num*i;
			System.out.println(i+"*"+num+"="+temp);
			temp =1;
		}
	}

}
