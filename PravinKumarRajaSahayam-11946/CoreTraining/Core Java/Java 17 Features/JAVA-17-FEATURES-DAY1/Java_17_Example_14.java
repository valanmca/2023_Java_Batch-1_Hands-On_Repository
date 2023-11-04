//Java - 17 Randam class number splitted
import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;
public class Java_17_Example_14 {
	public static void main(String[] args) {
		SplittableRandom random1 = new SplittableRandom();
		SplittableRandom random2 = random1.split();
		SplittableRandom random3 = random1.split();
		int number1 = random2.nextInt(10, 30);
		int number4 = random3.nextInt(40, 60);
		System.out.println("Random Number is:" + " " + number1);
		System.out.println("Random Number is:" + " " + number4);
	}
}