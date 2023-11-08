package com.dharshu.day16;

import java.util.random.RandomGenerator;

public class Random_Generator_Class {

	public static void main(String[] args) {
		//With default algorithm
				RandomGenerator generator1 = RandomGenerator.getDefault();
				System.out.println(generator1.ints(10,20).limit(10).boxed().toList());
				//With Specified Algorithms
				RandomGenerator generator2 = RandomGenerator.of("L128X1024MixRandom");
				System.out.println(generator2.ints(10,20).limit(10).boxed().toList());


	}

}
