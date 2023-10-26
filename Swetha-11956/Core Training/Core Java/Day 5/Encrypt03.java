//Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData)
//that define encryption and decryption operations. 
//Create two classes AES and RSA that implement the Encryptable interface 
//and provide their own encryption and decryption algorithms.4

package JavaOops5;

interface Encryptable{
	void encrypt(String data);
	void decrypt(String encryptedData);
}
class AES implements Encryptable{
	
	public void encrypt(String data) {
		System.out.println("Encrypted successfully for AES");
		
	}
	public void decrypt(String encryptedData) {
		System.out.println("Decrypted successfully for AES");
	}
	
}
class RSA implements Encryptable{
	
	public void encrypt(String data) {
		System.out.println("Encrypted successfully for RSA");
		
	}
	public void decrypt(String encryptedData) {
		System.out.println("Decrypted successfully for RSA");
	}
}

public class Encrypt03 {

	public static void main(String[] args) {

		Encryptable obj=new AES();
		obj.encrypt("hello");
		obj.decrypt("world");
		System.out.println("");
		
		Encryptable obj1=new RSA();
		obj1.encrypt("hello");
		obj1.decrypt("world");
		
		
	}

}

