//Example for Strongly Encapsulated JDK Internals
package com.sara.CoreJava.Day_17;

import java.nio.ByteBuffer;

public class JDKExample02 {

	public static void main(String[] args) {

		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		//long value = ((sun.nio.ch.DirectBuffer) buffer).address();
		//System.out.println(value);
	}

}
