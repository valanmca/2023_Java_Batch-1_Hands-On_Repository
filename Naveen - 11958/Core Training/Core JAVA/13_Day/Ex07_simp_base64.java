package com.naveen.day_13;

import java.util.Base64;

public class Ex07_simp_base64 {

	public static void main(String[] args) {
		// create a sample String to encode
        String sample = "Naveenraj Karthikeyan";
 
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
