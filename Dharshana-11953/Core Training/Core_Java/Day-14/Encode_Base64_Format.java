package com.dharshu.day14;

import java.util.Base64;

public class Encode_Base64_Format {

	public static void main(String[] args) {
		// create a sample String to encode
        String sample = "Dharshu Minion";

        // print actual String
        System.out.println("Sample String:"+ sample);

        // Encode into Base64 format
        String BasicBase64format = Base64.getEncoder().encodeToString(sample.getBytes());

        // print encoded String
        System.out.println("Encoded String:"+ BasicBase64format);
	}

}
