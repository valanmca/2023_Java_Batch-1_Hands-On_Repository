package com.swetha.features;

import java.util.Random;
import java.util.random.RandomGenerator;

public class randomNumber {

	public static void main(String[] args) {

		Random random=new Random();
		int num1=random.nextInt(10);
		float num2=random.nextFloat(10);
		int num3=random.nextInt(10,20);
		float num4=random.nextFloat(10,20);
		System.out.println("Random number is : "+num1);
		System.out.println("Random number is : "+num2);
		System.out.println("Random number is : "+num3);
		System.out.println("Random number is : "+num4);
		
		RandomGenerator generator2=RandomGenerator.of("L128X1024MixRandom");
		System.out.println(generator2.ints(10,20).limit(10).boxed().toList());
	}

}
