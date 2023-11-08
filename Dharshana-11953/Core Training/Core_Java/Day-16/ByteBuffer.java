package com.dharshu.day16;

public class ByteBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		long value = ((sun.nio.ch.DirectBuffer) buffer).address(); // This version does not support in our System.
		System.out.println(value);

	}

}
