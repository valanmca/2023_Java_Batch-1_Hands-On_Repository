package com.jeban.Assignment4;

interface Encryptable{
	void encrypt(String data);
	void decrypt(String encryptData);
}
class AES implements Encryptable{
	public void encrypt (String data) {
		System.out.println("Encrypted Successfull for AES");
	}
	public void decrypt(String encryptData) {
		System.out.println("Decrypted Successfull for AES");
	}
}
class RSA implements Encryptable{
	public void encrypt (String data) {
		System.out.println("Encrypted Successfull for RSA");
	}
	public void decrypt(String encryptData) {
		System.out.println("Decrypted Successfull for RSA");
	}
}



public class Encrypt {

	public static void main(String[] args) {
		AES obj=new AES();
		RSA obj1=new RSA();
		obj.encrypt("Successfull");
		obj.decrypt("Successful");
		obj1.encrypt("Successfull");
		obj1.decrypt("Successful");
		
	}

}
