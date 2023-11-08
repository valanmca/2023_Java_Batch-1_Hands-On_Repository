package com.dharshu.day16;

import java.util.Random;

public class PRNG {

	public static void main(String[] args) {
		//Generate Random Number with Upper limit
				Random random = new Random();
				int num1 = random.nextInt(10);
				float num2 = random.nextFloat(10);
				//Generate Random Number with Upper limit and Lower limit
				int num3 = random.nextInt(10,20);
				float num4 = random.nextFloat(10,20);
				System.out.println("Random Number is : "+num1);
				System.out.println("Random Number is : "+num2);
				System.out.println("Random Number is : "+num3);
				System.out.println("Random Number is : "+num4);


	}

}
