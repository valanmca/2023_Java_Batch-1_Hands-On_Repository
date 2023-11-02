package com.core.day_13;

import java.util.Base64;
public class Base641 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String sample = "India Team will win the Cup";

	        // print actual String
	        System.out.println("Sample String:\n"
	                        + sample);

	        // Encode into Base64 format
	        String BasicBase64format
	            = Base64.getEncoder()
	                .encodeToString(sample.getBytes());

	        // print encoded String
	        System.out.println("Encoded String:\n"
	                        + BasicBase64format);
	}

}
