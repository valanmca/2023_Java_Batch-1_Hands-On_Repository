//Java program for  Encryptable interface for AES and RSA encryption
package com.sara.CoreJava.Day_07;

interface Encryptable {
	void encrypt(String data);

	void decrypt(String encryptedData);
}

class AES implements Encryptable {
	public void encrypt(String data) {
		if (data == "Document") {
			System.out.println("The encrypted value is 1243568790");// Sample logics used for AES
		}
	}

	public void decrypt(String encryptedData) {

		if (encryptedData == "1243568790") {
			System.out.println("The decrypted value is Document");
		}
	}
}

class RSA implements Encryptable {
	public void encrypt(String data) {
		if (data == "Document") {
			System.out.println("The encrypted value is 1243568790");// Sample logics used for RSA
		}
	}

	public void decrypt(String encryptedData) {

		if (encryptedData == "1243568790") {
			System.out.println("The decrypted value is Document");
		}
	}
}

public class Assignment_03 {

	public static void main(String[] args) {
		AES aes = new AES();
		aes.encrypt("Document");
		aes.decrypt("1243568790");
		RSA rsa = new RSA();
		rsa.encrypt("Document");
		rsa.decrypt("1243568790");
	}

}
