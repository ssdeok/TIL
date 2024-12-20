package org.example.collectionprac;

import java.util.HashMap;
import java.util.Map;


public class Student {

        private String name;
        private int age;
        // 컬렉션을 변수로 받은것임
        private Map<String, Integer> grade;

        public Student(String name, int age) {
                this.name = name;
                this.age = age;
                // 위에 선언했기때문에 <>안을 안적어도됨
                this.grade = new HashMap<>();
        }

        // 하나의 메서드일뿐, 아래 코드와 상관없음
//        public void setGrade(Map<String, Integer> grade) {
//                this.grade = grade;
//        }

        // 과목 / 성적을 받는다 => grade에 추가한다 => 1. grade return / 2. void return
        // 학생의 이름과 나이를 알 수 있고, 과목을 추가할 수 있다.
        // 일반 메서드형식인데, 컬렉션에서는 이런식으로
        public Map<String, Integer> addGrade(String subject, Integer score) {
                grade.put(subject, score);

                return grade;
        }

        public void showInfo() {
                System.out.println("name = " + name);
                System.out.println("age = " + age);
                System.out.println("grade = " + grade);
        }

        public double averageScore() {
                //합계 / 개수
                Integer sum =0;
                for (String key : grade.keySet()) {

                      Integer value = grade.get(key);
                      sum += value;

                }
                return (double) sum / grade.size();
        }

        public String getName() {
                return name;
        }



        //        HashMap<String, Integer> people = new HashMap<>();

//        // 이름, 나이
//        people.put("deok", 35);
//        people.put("jung", 25);
//        people.put("ho", 30);
//        System.out.println(people);
//
//        // 과목별 성적 저장
//        HashMap<String, Integer> score = new HashMap<>();
//        score.put("langage", 50);
//        score.put("social", 70);
//        score.put("math", 80);
//        System.out.println(score);
//
//        // 성적의 평균 계산
//
//        int i = (score.get("langage") + score.get("social") + score.get("math")) / 3;
//        System.out.println(i);
//    }
}
