package com.naveen.day_15;

import sun.misc.Unsafe;
public class Ex07_SE_JDK_I {

	public static void main(String[] args) {
		Unsafe unsafe = Unsafe.getUnsafe();
		long value = unsafe.allocateMemory(1024);
		System.out.println(value);
	}

}
