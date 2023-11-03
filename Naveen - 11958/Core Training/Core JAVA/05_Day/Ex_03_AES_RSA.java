package com.naveen.day5;

interface Encryptable {
	void encrypt(String data);

	void decrypt(String encryptdata);
}

class AES implements Encryptable {
	public void encrypt(String data) {
		System.out.println("Encrpyted Sucessfully for AES");
	}

	public void decrypt(String data) {
		System.out.println("Decrpyted Sucessfully for AES");
	}
}

class RSA implements Encryptable {
	public void encrypt(String data) {
		System.out.println("Encrpyted Sucessfully for RSA");
	}

	public void decrypt(String data) {
		System.out.println("Decrpyted Sucessfully for RSA");
	}
}

public class Ex_03_AES_RSA {

	public static void main(String[] args) {

		Encryptable aes = new AES();
		aes.encrypt("Success");
		aes.decrypt("Success");

		Encryptable rsa = new RSA();
		rsa.encrypt("Success");
		rsa.decrypt("Success");
	}

}