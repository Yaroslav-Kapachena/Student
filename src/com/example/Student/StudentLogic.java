package com.example.Student;

public class StudentLogic {
    public static void move (Student student,String... name){
        System.out.print("Студент "+student.getFullName()+" бежит.");
    }
    public  static  void talk(Student student,String... name){
        System.out.println("Студент "+student.getFullName()+" говорит.");
    }

}
