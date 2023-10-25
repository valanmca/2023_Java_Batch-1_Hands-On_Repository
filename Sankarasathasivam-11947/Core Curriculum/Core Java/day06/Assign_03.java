package com.shiva.core.day06;

interface Encryptable{
	void encrypt(String data);
	void decrypt(String encryptedData);
}

class AES implements Encryptable{
	public void encrypt(String data) {
		System.out.println("The Data is Encrypted By Shiva");
	}
	public void decrypt(String encryptedData) {
		System.out.println("The Data is Decrypted By Aravind");
	}
}

class RSA implements Encryptable{
	public void encrypt(String data) {
		System.out.println("The Data is Encrypted By Sankar");
	}
	public void decrypt(String encryptedData) {
		System.out.println("The Data is Decrypted By Shiva");
	}
}

public class Assign_03 {

	public static void main(String[] args) {
		AES obj=new AES();
		obj.encrypt("101231");
		obj.decrypt("Java");
		RSA obj1=new RSA();
		obj1.encrypt("151");
		obj1.decrypt("AEA");
	}

}
