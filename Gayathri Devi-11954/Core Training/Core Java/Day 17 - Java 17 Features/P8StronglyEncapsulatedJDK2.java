package com.gayathri.day17Java17Features;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class P8StronglyEncapsulatedJDK2 {

	public static void main(String[] args) {
	
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		long value = ((sun.nio.ch.DirectBuffer)buffer).address();
		System.out.println(value);
	}

}
