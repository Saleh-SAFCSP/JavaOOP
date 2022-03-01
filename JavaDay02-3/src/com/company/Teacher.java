package com.company;

import java.util.ArrayList;

public class Teacher extends SchoolPerson {

    private int salary;
    private ArrayList <String> classList;

    public Teacher(String name,int age,int salary,String major){
        super(name, age, major);
        System.out.println("Hey from Teacher");
        this.salary=salary;
        classList=new ArrayList<>();
    }


    public void addClass(String className){
        classList.add(className);
    }

    public ArrayList<String> getClassList() {
        return classList;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary < 100){
            return;
        }
        this.salary = salary;
    }


    @Override
    public void leave() {
        System.out.println("Teacher leave");
    }
}
