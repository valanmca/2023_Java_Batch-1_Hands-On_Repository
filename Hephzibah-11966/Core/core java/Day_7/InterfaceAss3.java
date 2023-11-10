package Day_7;

interface encryptable{
    void encrypt(String data);
    void decrypt(String encryptData);
}

class AES implements encryptable{
    public void encrypt(String data) {
        System.out.println("data:"+data);
        if(data=="Hephzi"){
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
                encryptData = "Hephzi";
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
        if(data=="Hephzi"){
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
                encryptData = "Hephzi";
            System.out.println("Decrypted Successfully for RSA "+encryptData);    
        }
        else {
            System.out.println("Failed"+encryptData);
        }
        
}
}

public class InterfaceAss3 {

    public static void main(String[] args) {
        
        encryptable aes=new AES();
        aes.encrypt("Hephzi");
        aes.decrypt("*-/*(*(");        
        encryptable rsa = new RSA();
        rsa.encrypt("Hephzi");
        rsa.decrypt("*-/*(*(");

    }

}
