package com.company;

public class Main {

    public static void main(String[] args)  {
	// write your code here

      // Types of errors in programming :
        // 1- Syntax error
        // 2- Runtime error
        // 3- Logical error

        // Syntax error

        // Runtime error

        int number1=5;
        int number2=0;

        int arr[]=new int[3];

//        try {
//            if(arr.length>2) {
//                throw new ArithmeticException("Error");
//            }
//            System.out.println("Last line in try");
//        }catch (Exception  e){
//            System.out.println(e);
//        }

        try {
            System.out.println(div(4, 2));
         //   System.out.println(div(4, 0));
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Last line from main");
        }

        // Logical

        System.out.println(div(1,5));


    }


    public static int div(int number1,int number2) throws  ArithmeticException{
       return  number1+number2;
    }
}
