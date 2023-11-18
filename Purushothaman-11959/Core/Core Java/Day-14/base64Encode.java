package com.purushoth.day_14;

import java.util.Base64;

public class base64Encode {

	public static void main(String[] args) {
		String sample="India team will win the cup";
		
		System.out.println("Sample String:\n"+sample);
		
		String bbf=Base64.getEncoder().encodeToString(sample.getBytes());
		
		System.out.println("Encoded String: \n"+bbf);

	}

}
