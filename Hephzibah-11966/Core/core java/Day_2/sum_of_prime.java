package Java_Basics;
import java.util.Scanner;  

public class sum_of_prime {

	    public static void main(String[] args) {
	        int count = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number : ");
	        int n = sc.nextInt();
	        int sum = 0;

	        for (int i = 2; i <= n; i++) {
	            count = 0;
	            for (int j = 2; j <= i; j++) {
	                if (i % j == 0) {
	                    count++;

	                }

	            }
	            if (count == 1) {
	                sum = sum + i;
	            }

	        }
	        System.out.println("Thes sum of prime numbers are : "+ sum);
	    }
	}
