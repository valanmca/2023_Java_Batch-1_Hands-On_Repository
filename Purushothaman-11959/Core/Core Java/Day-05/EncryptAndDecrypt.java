package com.purushoth.day_05;

interface Encryptable {
	void encrypt(String data);
	void decrypt(String encryptedData);
}

class AES implements Encryptable{
	public void encrypt(String data) {
		if(data=="Document") {
			System.out.println("The encrypted value is 97834286");//Sample logics used for AES & RSA
		}
	}
	public void decrypt(String encryptedData) {
		if(encryptedData=="97834286") {
			System.out.println("The decrypted value is Document");
		}
	}
}

class RSA implements Encryptable{
	public void encrypt(String data) {
		if(data=="Document") {
			System.out.println("The encrypted values is 23498712");
		}
	}
	public void decrypt(String encryptedData) {
		if(encryptedData=="23498712") {
			System.out.println("The decrypted value is Document");
		}
	}
}
public class EncryptAndDecrypt {

	public static void main(String[] args) {
        AES aes=new AES();
        aes.encrypt("Document");
        aes.decrypt("97834286");
        RSA rsa=new RSA();
        rsa.encrypt("Document");
        rsa.decrypt("23498712");
	}

}
