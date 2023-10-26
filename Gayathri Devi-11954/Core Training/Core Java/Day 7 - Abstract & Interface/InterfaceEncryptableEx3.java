package com.gayathri.day6;
/*
 * Write a java program to create an interface encryptable with methods encrypt(String data) and decrypt (String encrypt data) that
 * define encryption and decryption operations. Create two classes AES ans RSA that implement th encryptable interface and 
 * provide their own encryption and decryption.
 */

interface Encryptable {
	void encrypt(String data);
	void decrypt(String encryptdata);
}

class AES implements Encryptable{
		String encryptdata = "Gayathri";
		String decryptdata = "!@#$%^&*";
		
		public void encrypt(String data) {
		if(encryptdata == data)		{
			encryptdata = "!@#$%^&*";
			System.out.println("Data was encrypted. From "+data+" to "+encryptdata);
		}
		else {
			System.out.println("Data was not encrypted ");
		}

	}
	public void decrypt(String encryptdata) {
		if(decryptdata == encryptdata) {
			decryptdata = "Gayathri";
			System.out.println("Data was decrypted. From "+encryptdata+" to "+decryptdata);
		}
		else {
			System.out.println("Data was not decrypted ");
		}
	}
}

class RSA implements Encryptable {
	String encryptdata = "Devi";
	String decryptdata = "()_+";
	
	public void encrypt(String data) {
	if(encryptdata == data)		{
		encryptdata = "()_+";
		System.out.println("Data was encrypted. From "+data+" to "+encryptdata);
	}
	else {
		System.out.println("Data was not encrypted ");
	}

}
public void decrypt(String encryptdata) {
	if(decryptdata == encryptdata) {
		decryptdata = "Devi";
		System.out.println("Data was decrypted. From "+encryptdata+" to "+decryptdata);
	}
	else {
		System.out.println("Data was not decrypted ");
	}
}}

public class InterfaceEncryptableEx3 {

	public static void main(String[] args) {
		Encryptable aes = new AES();
		aes.encrypt("Gayathri");
		aes.decrypt("!@#$%^&*");
		
		Encryptable rsa = new RSA();
		rsa.encrypt("Devi");
		rsa.decrypt("()_+");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
