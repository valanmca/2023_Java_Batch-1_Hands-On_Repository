package com.dharshu.day16;

import java.util.SplittableRandom;

public class Splittable_Random_Class {

	public static void main(String[] args) {
		// SplittableRandom Class
				SplittableRandom random1 = new SplittableRandom();
				SplittableRandom random2 = random1.split();
				SplittableRandom random3 = random1.split();
				int num1 = random2.nextInt(10, 20);
				int num2 = random3.nextInt(10, 20);
				System.out.println("Random Integer Number is : " + num1);
				System.out.println("Random Integer Number is : " + num2);


	}

}
