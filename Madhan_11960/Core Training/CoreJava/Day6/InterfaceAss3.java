package com.madhan.coreday6;

interface Encryptable {
    void encrypt(String data);
}

interface Decryptable {
    void decrypt(String data);
}

class AES implements Encryptable, Decryptable {
    public void encrypt(String info) {
        System.out.println("info : " + info);

        if (info == "MADHAN") {
            info = "TY&(*(()";
            System.out.println("Successfully Encrypted in AES: " + info);
        }

        else {
            System.out.println("Failed to convert in AES");
        }
    }

    public void decrypt(String info) {

        if (info == "TY&(*(()") {
            info = "MADHAN";
            System.out.println("Successfully Decrypted in AES: " + info);
        } else {
            System.out.println("Failed to convert in AES");
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
            System.out.println("Failed to convert in RSA");
        }
        
    }

    public void decrypt(String info) {

        if (info == "*-/*&(*(()") {
            info = "IOIOHJH";
            System.out.println("Successfully Decrypted in RSA: " + info);
        } else {
            System.out.println("Failed to convert in RSA");
        }
        System.out.println();
    }
}

public class InterfaceAss3 {

    public static void main(String[] args) {
        

        AES run = new AES();
        run.encrypt("MADHAN");
        run.decrypt("TY&(*(()");

        RSA exe = new RSA();
        exe.encrypt("IOIOHJH");
        exe.decrypt("*-/*&(*(()");
    }

}

