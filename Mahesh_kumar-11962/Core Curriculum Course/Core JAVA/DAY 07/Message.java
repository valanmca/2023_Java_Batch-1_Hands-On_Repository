package com.mahesh.core_java_day_07;

interface Encryptable {
	void encrypt(String data);
}

interface Decryptable {
	void decrypt(String data);
}

class AES implements Encryptable, Decryptable {
	public void encrypt(String info) {
		System.out.println("info : " + info);

		if (info == "MAHESH") {
			info = "TY&(*(()";
			System.out.println("Successfully Encrypted in AES: " + info);
		}

		else {
			System.out.println("Failled to convert in AES");
		}
	}

	public void decrypt(String info) {

		if (info == "TY&(*(()") {
			info = "MAHESH";
			System.out.println("Successfully Decrypted in AES: " + info);
		} else {
			System.out.println("Failled to convert in AES");
		}
		System.out.println();

	}
}

class RSA implements Encryptable, Decryptable {
	public void encrypt(String info) {
		System.out.println("info : " + info);
		if (info == "IOIOHJH") {
			info = "*-/*&(*(()";
			System.out.println("Successfully Encrypted in RSA: " + info);
		}

		else {
			System.out.println("Failled to convert in RSA");
		}
		
	}

	public void decrypt(String info) {

		if (info == "*-/*&(*(()") {
			info = "IOIOHJH";
			System.out.println("Successfully Decrypted in RSA: " + info);
		} else {
			System.out.println("Failled to convert in RSA");
		}
		System.out.println();
	}
}

public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AES run = new AES();
		run.encrypt("MAHESH");
		run.decrypt("TY&(*(()");

		RSA exe = new RSA();
		exe.encrypt("IOIOHJH");
		exe.decrypt("*-/*&(*(()");
	}

}
