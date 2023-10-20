//Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData)
//that define encryption and decryption operations. 
//Create two classes AES and RSA that implement the Encryptable interface 
//and provide their own encryption and decryption algorithms.

package com.dharshu.day6;

interface encryptable{
	void encrypt(String data);
	void decrypt(String encryptData);
}

class AES implements encryptable{
	public void encrypt(String data) {
		System.out.println("data:"+data);
		if(data=="Dharshu"){
			data ="*-/*(*(";
			System.out.println("Encrypted Successfully for RSA "+data);	
		}
		else {
			System.out.println("Failed"+data);
		}
		
	}
	public void decrypt(String encryptData) {
		System.out.println("encryptData:"+encryptData);
	
		if(encryptData =="*-/*(*("){
				encryptData = "Dharshu";
			System.out.println("Decrypted Successfully for RSA "+encryptData);	
		}
		else {
			System.out.println("Failed"+encryptData);
		}
	}
}

class RSA implements encryptable{
	public void encrypt(String data) {
		System.out.println("data:"+data);
		if(data=="Dharshu"){
			data ="*-/*(*(";
			System.out.println("Encrypted Successfully for RSA "+data);	
		}
		else {
			System.out.println("Failed"+data);
		}
		
	}
	public void decrypt(String encryptData) {
		System.out.println("encryptData:"+encryptData);
	
		if(encryptData =="*-/*(*("){
				encryptData = "Dharshu";
			System.out.println("Decrypted Successfully for RSA "+encryptData);	
		}
		else {
			System.out.println("Failed"+encryptData);
		}
		
}
}

public class Ex_03_Encryption_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encryptable aes=new AES();
		aes.encrypt("Dharshu");
		aes.decrypt("*-/*(*(");		
		encryptable rsa = new RSA();
		rsa.encrypt("Dharshu");
		rsa.decrypt("*-/*(*(");

	}

}
