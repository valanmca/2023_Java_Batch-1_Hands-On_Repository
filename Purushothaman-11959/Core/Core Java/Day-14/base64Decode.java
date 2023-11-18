package com.purushoth.day_14;

import java.util.Base64;

public class base64Decode {

	public static void main(String[] args) {
		
		String enc="SW5kaWEgdGVhbSB3aWxsIHdpbiB0aGUgY3Vw"; //From base64Encode
		
		System.out.println("Encoded String:\n"+enc);
		
		byte[]  aB=Base64.getDecoder().decode(enc);
		
		String aS=new String(aB);
		
		System.out.println("Actual String:\n"+aS);
		

	}

}
