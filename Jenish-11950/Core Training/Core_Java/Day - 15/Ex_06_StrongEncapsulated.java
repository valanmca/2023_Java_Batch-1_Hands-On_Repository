package com.jenish.day15;
import sun.misc.Unsafe;
public class Ex_06_StrongEncapsulated {

	public static void main(String[] args) {
		Unsafe unsafe = Unsafe.getUnsafe();
		long value = unsafe.allocateMemory(1024);
		System.out.println(value);
	}

}
