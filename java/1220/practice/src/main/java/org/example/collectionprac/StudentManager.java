package org.example.collectionprac;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    //    - 학생들의 목록을 관리(가지고 있음)
//    - 학생 추가, 검색
//    - 학생들의 정보 조회
    private List<Student> students;


    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public List<Student> addStudent(Student student){
        students.add(student);
        return students;
    }

    public void showStudentsInfo(){
        for (Student student : students) {
            student.showInfo();
            System.out.println();
        }
    }

    public Student findStudentByName(String name){
        // 이름이 같은 학생을 return하자.
        for (Student student : students) {
            if (student.getName().equals(name)){
                return student;
            }
        }

        return null;

    }
}
