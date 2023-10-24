package Core_Topic_Domnic_Day_2;
import java.util.Scanner;
public class Assg5 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++) {
    	fact=fact*i;
    }
    System.out.println("The factorial of "+num+" is "+fact);
	}

}
