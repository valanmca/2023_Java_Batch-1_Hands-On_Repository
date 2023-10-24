package Core_Topic_Domnic_Day_2;
import java.util.Scanner;
public class Assg3 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number ");
   int num=sc.nextInt();
   int n=1;
   int value=0;
   for(int i=1;i<=10;i++) {
	   value=num*n;
	   System.out.println(num+"*"+n+"="+value);
	   n++;
   }
   
	}

}
