package com.jeyavel.core.java17;

import sun.misc.Unsafe;

public class StronglyEncapsulatedJDK {

	public static void main(String[] args) {
		Unsafe unsafe = Unsafe.getUnsafe();
		long value = unsafe.allocateMemory(1204);
		System.out.println(value);

	}

}
