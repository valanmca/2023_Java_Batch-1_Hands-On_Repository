package com.core.day_06;
interface Encryptable{
	 void encrypt(String Data);
	 void decrypt(String encryptedData);
		 
	 
}

class AES implements Encryptable
{
	public void encrypt(String Data) {
		
		
			
		
		System.out.println("Encryption done by using AES");
		
	}
	 public void decrypt(String encryptedData) {
		 System.out.println("Decryption done by using AES"); 
	 }
}

class RSA implements Encryptable
{
	public void encrypt(String Data) {
		System.out.println("Encryption done by using RSA");
	}
	 public void decrypt(String encryptedData) {
		 System.out.println("Decryption done by using RSA");
	 }
}
public class Ass_3 {

	public static void main(String[] args) {
		
		AES obj=new AES();
		obj.encrypt("aravind");
		obj.decrypt("dnivara");
		
		RSA obj1=new RSA();
		obj1.encrypt("kumar");
		obj1.decrypt("ramuk");
		
	}

}
