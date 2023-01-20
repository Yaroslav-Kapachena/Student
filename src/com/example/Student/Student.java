package com.example.Student;

public class Student {
    String fullName;
    int age;
    int groupNumber;


    public Student(String fullname,int age,int groupNumber){
        this.fullName = fullname;
        this.age = age;
        this.groupNumber = groupNumber;
    }
    public  Student(){
        System.out.println(student2);
    }
    public Student(String fullName,int age){
        System.out.println(student3);
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
    Student student2 = new Student("Игорь",50,2);
    Student student3 = new Student("Ярослав",14,4);
}
