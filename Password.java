package com.hemnanisahil;
public class Password {
    private int attempts=0;
    private static final int key= 59949411;     //-->random key for cryptographic use
    private int encryptedPassword;                 //-->password encrypted by cryptography
    public Password(int password) {             //-->constructor for encrypting the password
        this.encryptedPassword = encryptDecrypt(password);
    }
    private int encryptDecrypt(int password){
        return key ^ password;                  //-->cryptographic technique to encrypt the passwords using XOR bitwise operation.
    }
    public final void storePassword(){          //-->adding "final" keyword will increase the security
        System.out.println("saving password as "+this.encryptedPassword);// no other class can override the method as per the security concerns.
    }
    public boolean letMeIn(int password) {      //-->actual method where user will enter the password
        if (attempts != 3) {                    //-->ONLY THREE ATTEMPTS ARE ALLOWED
            if (encryptDecrypt(password) == this.encryptedPassword) {
                System.out.println("Welcome");
                attempts=0;
                return true;
            } else {
                attempts++;
                System.out.println("Nope, you cant come in");
                return false;
            }
        } else {
            System.out.println("out of attempts! your account is been blocked");
            System.exit(0);
            attempts++;
            return false;
        }
    }
}
