package com.shiva.core.day15;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rm = new Random();
		int num = rm.nextInt(1, 7);
		System.out.println("Random number is: " + num);
		

	}

}
