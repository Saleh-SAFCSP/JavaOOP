package com.company;

import java.util.ArrayList;

 public class Student extends SchoolPerson  {

    private String className;

    public Student(String name, int age, String className, String major){
        super(name,age,major);
        System.out.println("Hey from student");
        this.className=className;
    }

     public Student(String name, int age, String major){
         System.out.println("Hey from student");
     }

    public String getClassName() {
        return className;
    }

    @Override
     public String getName(){
         return "asdsa";
     }

    public void setClassName(String className) {
        this.className = className;
    }

    public void leave(){
        System.out.println("Student leave");
    }


}
