package com.gayathri.day15Java8Features;

import java.util.Base64;

public class P12Base64 {

	public static void main(String[] args) {
		String sample = "Gayathri Devi";
		System.out.println("Sample String : "+sample);
		
		String encodeAnswer = Base64.getEncoder().encodeToString(sample.getBytes());
		System.out.println("Base 64 Format encoding : "+encodeAnswer);
		
		byte[] decodeAnswer = Base64.getDecoder().decode(encodeAnswer);
		System.out.println("Base 64 Format decoding : "+decodeAnswer);

	}

}
