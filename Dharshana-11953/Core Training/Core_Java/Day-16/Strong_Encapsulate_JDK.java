package com.dharshu.day16;

import sun.misc.Unsafe;

public class Strong_Encapsulate_JDK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unsafe unsafe = Unsafe.getUnsafe();
		long value = unsafe.allocateMemory(1024);
		System.out.println(value);
		//Throws an Exception : java.lang.SecurityException
	}

}
