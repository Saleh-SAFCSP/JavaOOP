package com.company;

import java.util.ArrayList;

public abstract class SchoolPerson  {

    private static  String schoolName="SAFCSP";
    private String name;
    private int age;
    private String major;
    private ArrayList<String> subjectList;



    public SchoolPerson(String name, int age, String major) {
        System.out.println("Hey from SchoolPerson");
        this.name = name;
        this.age = age;
        this.major = major;
        subjectList=new ArrayList<>();
    }
    public SchoolPerson(String name) {
        System.out.println("Hey from SchoolPerson");
        this.name = name;
        subjectList=new ArrayList<>();
    }

    public SchoolPerson() {
        System.out.println("Hey from SchoolPerson");
        this.name = name;
        subjectList=new ArrayList<>();
    }

     public void setName(String name){
        if(name.length()>3) {
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public void addSubject(String subject){
        subjectList.add(subject);
    }

    static public void changeSchoolName(String schoolName1){
        schoolName=schoolName1;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        SchoolPerson.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    abstract public void leave();

    @Override
    public String toString() {
        return "SchoolPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
