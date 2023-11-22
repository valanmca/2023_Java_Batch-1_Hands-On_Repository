package com.gayathri.day17Java17Features;

import java.util.Random;
		import java.util.Scanner;
		import java.util.SplittableRandom;
		import java.util.random.RandomGenerator;
public class P13RandomClass {

	   public static void main(String[] args) {

		        // Generate Random Number
//		        Random random = new Random();
//		        int num1 = random.nextInt();
//		        float num2 = random.nextFloat();
//		        double num3 = random.nextDouble();
//		        long num4 = random.nextLong();
//		        System.out.println("Random Integer Number is : "+num1);
//		        System.out.println("Random Float Number is : "+num2);
//		        System.out.println("Random Double Number is : "+num3);
//		        System.out.println("Random Long Number is : "+num4);

		        // Generate Random Number with Upper limit
//		        Random random = new Random();
//		        int num1 = random.nextInt(10);
//		        float num2 = random.nextFloat(10);
//		        double num3 = random.nextDouble(5);
		//
//		        long num4 = random.nextLong(5);
//		        System.out.println("Random Integer Number is : "+num1);
//		        System.out.println("Random Float Number is : "+num2);
//		        System.out.println("Random Double Number is : "+num3);
//		        System.out.println("Random Long Number is : "+num4);

//		        //Generate Random Number with Upper limit and Lower limit
//		        Random random = new Random();
//		        int num1 = random.nextInt(10,20);
//		        float num2 = random.nextFloat(10,20);
//		        double num3 = random.nextDouble(5,10);
//		        long num4 = random.nextLong(5,10);
//		        System.out.println("Random Integer Number is : "+num1);
//		        System.out.println("Random Float Number is : "+num2);
//		        System.out.println("Random Double Number is : "+num3);
//		        System.out.println("Random Long Number is : "+num4);

		        // SplittableRandom Class
//		        SplittableRandom random1 = new SplittableRandom();
//		        SplittableRandom random2 = random1.split();
//		        SplittableRandom random3 = random1.split();
//		        int num1 = random2.nextInt(10, 20);
//		        int num2 = random3.nextInt(10, 20);
//		        System.out.println("Random Integer Number is : " + num1);
//		        System.out.println("Random Integer Number is : " + num2);

//		        int generator = RandomGenerator.getDefault().nextInt();
//		        System.out.println(generator);

//		        //With default algorithm
//		        RandomGenerator generator1 = RandomGenerator.getDefault();
//		        System.out.println(generator1.ints(10,20).limit(10).boxed().toList());
//		        //With Specified Algorithms
//		        RandomGenerator generator2 = RandomGenerator.of("L128X1024MixRandom");
//		        System.out.println(generator2.ints(10,20).limit(10).boxed().toList());

//		        Random r = new Random();
//		        System.out.println(r.ints(10,20).limit(10).boxed().toList());

//		        Random r = new Random("L128X1024MixRandom");
//		        System.out.println(r.ints(10,20).limit(10).boxed().toList());
//		        

		        Random random = new Random();
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter Lower Boundary : ");
		        int lb = sc.nextInt();
		        System.out.println("Enter Upper Boundary : ");
		        int ub = sc.nextInt();
		        for (int i = 0; i <= 10; i++) {
		            int num1 = random.nextInt(lb, ub + 1);
		            System.out.println(num1);
		        }

		    }

		}


		
	/*	Random random = new Random();
		//generate random number 
		int num1 = random.nextInt();
		System.out.println("Random Number : "+num1);
		
		//generate random number with upper limit
		float num2 = random.nextFloat(10);
		System.out.println("Random Number : "+num2);
		
		//generate random number with limit like 10(start) to 20(end) - 10 to 19 
		int num = random.nextInt(1,6);//1 to 5
		System.out.println("Random Number : "+num);
*/
/*
		07 - 7
		08,09,018---ipdi ethum wrk aagathu
		010 to 017 - number-2
		020 to 027 - number-4
		030 to 037 - number-6
		040 to 047 - number-8
		050 to 057 - number-10
		...
*/
		int a = 040;
		System.out.println(a);
	}

}

