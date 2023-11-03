package com.naveen.day_13;

import java.util.Base64;

public class Ex08_base64_simp {

	public static void main(String[] args) {
		// create an encoded String to decode
        String encoded
            = "SW5kaWEgVGVhbSB3aWxsIHdpbiB0aGUgQ3Vw";
 
        // print encoded String
        System.out.println("Encoded String:\n"
                           + encoded);
 
        // decode into String from encoded format
        byte[] actualByte = Base64.getDecoder()
                                .decode(encoded);
 
        String actualString = new String(actualByte);
 
        // print actual String
        System.out.println("actual String:\n"
                           + actualString);
	}

}
