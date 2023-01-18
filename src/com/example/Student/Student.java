package com.example.Student;

public class Student {
    String fullName;
    int age;
    int groupNumber;

    public  Student(){

    }
    public Student(String fullName){

    }
    public Student(String fullname,int age,int groupNumber){
        this.fullName = fullname;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
