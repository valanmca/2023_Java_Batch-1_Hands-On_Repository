//Write a Java Programs to create an interfaces Encryptable with methods encrypt (String data) and decrypt (String encryptData) that defines encryption and decryption operations . Create two classes AES and RSA that implements the Encrytable interfaces and provide their own encryption and decryption algorithms.
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

interface Encryptable {
	String encrypt(String data);

	String decrypt(String encryptData);
}

class AES implements Encryptable {
	private static final String AES_ALGORITHMS = "AES";
	private SecretKey secretkey;

	public AES() {
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance(AES_ALGORITHMS);
			keyGen.init(128);
			secretkey = keyGen.generateKey();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String encrypt(String data) {
		try {
			Cipher cipher = Cipher.getInstance(AES_ALGORITHMS);
			cipher.init(Cipher.ENCRYPT_MODE, secretkey);

			byte[] encryptedBytes = cipher.doFinal(data.getBytes());
			return Base64.getEncoder().encodeToString(encryptedBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String decrypt(String encryptedData) {
		try {
			byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);

			Cipher cipher = Cipher.getInstance(AES_ALGORITHMS);
			cipher.init(Cipher.DECRYPT_MODE, secretkey);

			byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
			return new String(decryptedBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

class RSA implements Encryptable {
	private static final String RSA_ALGORITHMS = "RSA";
	private KeyPair keyPair;

	public RSA() {
		try {
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance(RSA_ALGORITHMS);
			keyGen.initialize(2048);
			keyPair = keyGen.generateKeyPair();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String encrypt(String data) {
		try {
			PublicKey publicKey = keyPair.getPublic();
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHMS);
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);

			byte[] encryptedBytes = cipher.doFinal(data.getBytes());
			return Base64.getEncoder().encodeToString(encryptedBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String decrypt(String encryptedData) {
		try {
			PrivateKey privateKey = keyPair.getPrivate();
			byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);

			Cipher cipher = Cipher.getInstance(RSA_ALGORITHMS);
			cipher.init(Cipher.DECRYPT_MODE, privateKey);

			byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
			return new String(decryptedBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

public class Abstract_Class_Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryptable AES = new AES();
		String encryptedDataforaes = AES.encrypt("DATA SECURITY OFFER");
		System.out.println("AES Encrypted is : " + encryptedDataforaes);
		String decryptedDataforaes = AES.decrypt(encryptedDataforaes);
		System.out.println("AES Decrypted is : " + decryptedDataforaes);
		Encryptable RSA = new RSA();
		String encryptedDataforrsa = RSA.encrypt("DATA SECURITY OFFERS");
		System.out.println("RSA Encrypted is : " + encryptedDataforrsa);
		String decryptedDataforrsa = RSA.decrypt(encryptedDataforrsa);
		System.out.println("RSA Decrypted is : " + decryptedDataforrsa);

	}

}