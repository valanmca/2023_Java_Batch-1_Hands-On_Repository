//Java - 17 Randam class number multiple
import java.util.Random;
import java.util.Scanner;
public class Java_17_Example_13 {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0;i<=5;i++) 
		{
		int number1 = random.nextInt(5);
		System.out.println("Random Number is" + " " + number1);
		}
	}
}