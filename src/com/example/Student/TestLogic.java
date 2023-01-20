package com.example.Student;

public class TestLogic {
    public static void main(String[] args) {
        Student student = new Student("Виктор",56,4);

        StudentLogic.move(student,"Ваня");
        StudentLogic.talk(student,"Андрей");
        Student student2 = new Student("Ярослав",14,4);
        Student student3 = new Student("Матвей",18,3);

    }
}
