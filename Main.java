package com.hemnanisahil;

public class Main {

    public static void main(String[] args) {

        Password password = new Password(123456);       //--->setting new password.
        password.storePassword();                       //--->encrypting it.
        password.letMeIn(1981919);              //--->1st wrong attempt
        password.letMeIn(65199);                //--->2nd wrong attempt
        password.letMeIn(123456);               //--->3rd attempt >>>correct!(attempts reset to 0)

        System.out.println("***********************************");


        password.letMeIn(619199);               //--->1st wrong attempt
        password.letMeIn(1919119);              //--->2nd wrong attempt
        password.letMeIn(991941914);            //3rd wrong attempt
        password.letMeIn(19111);                //4th wrong attempt(it will exit)

    }
}
