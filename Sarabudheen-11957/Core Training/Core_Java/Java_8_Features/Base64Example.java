package com.sara.CoreJava.Day_15;

import java.util.Base64;

public class Base64Example {

	public static void main(String[] args) {
		// Sample string to encode
		String sample = "Indian Team will win the world cup";

		// Printing sample string
		System.out.println("Sample String : \n" + sample);
		System.out.println(" ");

		// Encode into Base64 format
		// String BasicBase64format =
		// Base64.getEncoder().encodeToString(sample.getBytes());
		String encodeString = Base64.getEncoder().encodeToString(sample.getBytes());

		// Printing Encoded string
		System.out.println("Encoded String : \n" + encodeString);
		System.out.println(" ");

		// Decode into String format
		byte[] decodeByte = Base64.getDecoder().decode(encodeString);
		String decodeString = new String(decodeByte);

		// Printing Decoded string
		System.out.println("Decoded String : \n" + decodeString);
		System.out.println(" ");
	}

}
