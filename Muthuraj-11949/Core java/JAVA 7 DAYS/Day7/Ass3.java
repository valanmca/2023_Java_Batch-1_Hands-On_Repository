package Day7;
interface Encryptable {
	void encrypt(String data) ;
	void decrypt(String encryptedData);	
}
class AES implements Encryptable{
	public void encrypt(String data) {
		System.out.println("AES Encrypt:"+data);
		
	}
	public void decrypt(String encryptedData) {
		System.out.println("AES DECRYPT:"+encryptedData);
	}
}
class RES implements Encryptable{
	public void encrypt(String data) {
		System.out.println("RES Encrypt:"+data);
	}
	public void decrypt(String encryptedData) {
	System.out.println("AES DECRYPT:"+encryptedData);	
	}
}
public class Ass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// Obj1 Created with AES
		 Encryptable obj1=new  AES(); 
		 obj1.encrypt("EOD");
		 obj1.decrypt("End Of Day");

		//Obj2 Created with RES
		 Encryptable obj2=new RES();
		 obj2.encrypt("MoM");
		 obj2.decrypt("Minutes of  Meeting");	
	}
}
