package org.example.collectionprac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentManager {

    // 목록이니까 List
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public void showStudentsInfo() {
        for (Student student : students) {
            student.showInfo();
            System.out.println();
        }
    }

    public Student findStudentByName(String name) {
        // 이름이 같은 학생을 return 하자.
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }

        return null;


    // 학생들의 목록

        // 학생 추가, 검색
//        HashMap<String, Integer> student = new HashMap<>();
//        student.put("jun", 20);
//        student.put("beemo", 21);
//        student.put("lynda", 22);
//        System.out.println(student);

        // 학생들의 정보 조회


    }
}
