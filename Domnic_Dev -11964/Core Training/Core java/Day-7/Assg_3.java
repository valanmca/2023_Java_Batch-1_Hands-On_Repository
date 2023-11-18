package Core_Topic_Domnic_Day_7;

interface Encryptable{
	void encrypt(String data);
	void decrypt(int encryptedData);
}

class AES implements Encryptable{
	
	public void encrypt(String data) {
		if(data=="Domnic") {
			System.out.println("Encrypted value for "+data+" is 987654"+" in AES");
		}
	}
	public void decrypt(int encryptedData) {
		if(encryptedData==987654) {
			System.out.println("Decrypted value for "+encryptedData+" is Domnic"+" in AES");
		}
	}
}

class RSA implements Encryptable{
	public void encrypt(String data) {
		if(data=="Domnic") {
			System.out.println("Encrypted value for "+data+" is 987654"+" in RSA");
		}
	}
	public void decrypt(int encryptedData) {
		if(encryptedData==987654) {
			System.out.println("Decrypted value for "+encryptedData+" is Domnic"+" in RSA");
		}
	}
	
}


public class Assg_3 {

	public static void main(String[] args) {
    AES obj1=new AES();
    obj1.encrypt("Domnic");
    obj1.decrypt(987654);
    
    System.out.println();
    
    RSA obj2=new RSA();
    obj2.encrypt("Domnic");
    obj2.decrypt(987654);
	}

}
