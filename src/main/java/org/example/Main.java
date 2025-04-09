package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static String DBusername = "kevin";
    final static String DBpass = "123";

    public static void main(String[] args) {
        Login();
    }

    public static  void Login(){
        Scanner input = new Scanner(System.in);

        System.out.println(DBusername);
        System.out.println(DBpass);

        System.out.println("Input username:");
        String inputName = input.nextLine();

        if(inputName.isEmpty()) {
            System.out.println("Username can't be empty");
        }

        System.out.println("Input Password:");
        String inputPass = input.nextLine();

        if(inputPass.isEmpty()){
            System.out.println("Pass can't be empty");
        }

        if(inputName.equals(DBusername) && inputPass.equals(DBpass)){
            System.out.println("Credentials Valid");
            Random otp = new Random();
            int otpCode = otp.nextInt(10000);

            System.out.println(otpCode);
            System.out.println("Input OTP:");
            int inputOTP = input.nextInt();


            if(otpCode == inputOTP){
                System.out.println("OTP Valid");
            }else {
                System.out.println("OTP Wrong");
            }
        }else {
            System.out.println("Wrong Credentials");
        }
    }
}