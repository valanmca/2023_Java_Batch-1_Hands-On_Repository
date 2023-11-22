package com.gayathri.day17Java17Features;

import sun.misc.Unsafe;

public class P7StronglyEncapsulatedJDK {

	public static void main(String[] args) {
		Unsafe unsafe = Unsafe.getUnsafe();
		long value = unsafe.allocateMemory(1024);
		System.out.println(value);//Exception in thread "main" java.lang.SecurityException: Unsafe

	}

}
