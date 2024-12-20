package org.example.collectionprac;

import java.util.HashMap;
import java.util.Map;

public class Student {
    //    - 이름(String), 나이(int)
//    - 과목별 성적 저장
//    - 성적의 평균 계산
    private String name;
    private int age;
    private Map<String, Integer> grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = new HashMap<>();
    }

    // 과목 / 성적을 받는다 => grade에 추가한다 => 1. grade return / 2. void return
    public Map<String, Integer> addGrade(String subject, int score){
        grade.put(subject, score);
        return grade;
    }

    public void showInfo(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
    }

    public double averageScore(){
//        합계 / 개수
        Integer sum = 0;
        for (String key : grade.keySet()) {

            Integer value = grade.get(key);
            sum += value;

        }
        return (double) sum / grade.size();
    }


    public String getName() {
        return name;
    }


}
