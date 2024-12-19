package org.example.collectionprac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();

        // 이름, 나이
        people.put("deok", 35);
        people.put("jung", 25);
        people.put("ho", 30);
        System.out.println(people);

        // 과목별 성적 저장
        HashMap<String, Integer> score = new HashMap<>();
        score.put("langage", 50);
        score.put("social", 70);
        score.put("math", 80);
        System.out.println(score);

        // 성적의 평균 계산

        int i = (score.get("langage") + score.get("social") + score.get("math")) / 3;
        System.out.println(i);
    }
}
