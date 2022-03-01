package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Teacher t1=new Teacher("Saleh",23,500000,"CS");
        Student s1=new Student("Ali",50,"AB","CS");
        Student s2=new Student("Ali",50,"CS");

       t1.leave();
       s1.leave();
       t1.setSalary(999999999);

        System.out.println(sum(1,3));
        System.out.println(sum());
    }


    public static int sum(int number1,int number2){
        return number1+number2;
    }

    public static int sum(){
        return 1+5;
    }


}
