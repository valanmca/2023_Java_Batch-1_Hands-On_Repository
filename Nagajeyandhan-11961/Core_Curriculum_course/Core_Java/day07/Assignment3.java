package com.jeyandhan.day07;


interface Encryptable {
    void encrypt(String data);
    void decrypt(String data);
}


class AES implements Encryptable{
    public void encrypt(String info) {
        System.out.println("info : " + info);

        if (info == "Jeyandhan") {
            info = "TY&(*(()";
            System.out.println("Successfully Encrypted in AES: " + info);
        }

        else {
            System.out.println("Failled to convert in AES");
        }
    }

    public void decrypt(String info) {

        if (info == "TY&(*(()") {
            info = "Jeyandhan";
            System.out.println("Successfully Decrypted in AES: " + info);
        } else {
            System.out.println("Failled to convert in AES");
        }
        System.out.println();

    }
}

class RSA implements Encryptable{
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

public class Assignment3 {

    public static void main(String[] args) {
     
        AES run = new AES();
        run.encrypt("Jeyandhan");
        run.decrypt("TY&(*(()");

        RSA exe = new RSA();
        exe.encrypt("IOIOHJH");
        exe.decrypt("*-/*&(*(()");
    }

}
