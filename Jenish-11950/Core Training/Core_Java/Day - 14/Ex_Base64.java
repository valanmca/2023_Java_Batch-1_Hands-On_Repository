package com.jenish.day14;

import java.util.Base64;

public class Ex_Base64 {

	public static void main(String[] args) {
		// Java program to demonstrate
		// Encoding simple String into Basic Base 64 format
		    

		        // create a sample String to encode
		        String sample = "Jenish Immanuel Raj J";

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
