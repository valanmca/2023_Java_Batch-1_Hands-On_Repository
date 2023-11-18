//Example for Strongly Encapsulated JDK Internals
package com.sara.CoreJava.Day_17;

import sun.misc.Unsafe;

public class JDKExample01 {

	public static void main(String[] args) {

		Unsafe unsafe = Unsafe.getUnsafe();
		long value = unsafe.allocateMemory(1024);
		System.out.println(value);

	}

}
