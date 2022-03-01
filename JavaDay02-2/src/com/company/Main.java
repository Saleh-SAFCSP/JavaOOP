package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static  Scanner in=new Scanner(System.in);
    public static  ArrayList<String> arrayList=new ArrayList();

    public static void main(String[] args) throws  Exception {
	// write your code here

        Scanner in=new Scanner(System.in);

        String arr[]=new String[10];

        ArrayList<String> arrayList=new ArrayList();


//        while (true) {
//            System.out.println("Please enter your username : ");
//            String username = in.next();
//
//            System.out.println("Please enter your password : ");
//            String password = in.next();
//
//            if (!checkUsernameLength(username)) {
//                throw new Exception("Invalid username");
//            }
//
//            if (!checkPasswordLength(password)) {
//                throw new Exception("Invalid password");
//            }
//            arrayList.add(username);
//        }




        readUsername();
    }

//    public static boolean checkUsernameLength(String username){
//        return username.length() >= 3;
//    }
//
//    public static boolean checkPasswordLength(String password){
//        return password.length() >= 6;
//    }


    public static void readUsername()throws  Exception{
        System.out.println("Please enter you username : ");
        String username=in.next();
        readPassword(username);
    }

    public static void readPassword(String username)throws  Exception{
        System.out.println("Please enter you password : ");
        String password=in.next();
        checkLengthUsername(username,password);
    }

    public static void checkLengthUsername(String username,String password) throws  Exception{
        if(username.length()<3){
            throw new Exception("Invalid username");
        }
        checkLengthPassword(username,password);
    }

    public static void checkLengthPassword(String username,String password) throws  Exception{
        if(password.length()<6){
            throw new Exception("Invalid password");
        }
         arrayList.add(username);
    }



}
