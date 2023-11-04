//Java - 17 Randam class  number
import java.util.Random;
import java.util.Scanner;
public class Java_17_Example_12 {
	public static void main(String[] args) {
		Random random = new Random();
		int number1 = random.nextInt(0, 7);
		System.out.println("Random Number is" + " " + number1);
	}
}