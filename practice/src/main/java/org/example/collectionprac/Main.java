package org.example.collectionprac;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Student beemo = new Student("Beemo", 17);
        beemo.addGrade("korean", 10);
        beemo.addGrade("cs", 100);
        beemo.addGrade("math", 20);

        beemo.showInfo();
        System.out.println(beemo.averageScore());

        System.out.println("-------");

        Student lynda = new Student("Lynda", 14);
        lynda.addGrade("korean", 100);
        lynda.addGrade("cs", 30);
        lynda.addGrade("math", 40);

        lynda.showInfo();
        System.out.println(lynda.averageScore());

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(beemo);
        studentManager.addStudent(lynda);

        studentManager.showStudentsInfo();

        Student b = studentManager.findStudentByName("Beemo");
        b.showInfo();


    }
}
