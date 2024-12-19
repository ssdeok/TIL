package org.example.collectionprac;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // data 삽입
        list.add(1);
        list.add(3);

        System.out.println(list);

        list.add(1, 100);

        System.out.println(list);
        // 접근

        System.out.println(list.get(1));

        // 수정
        list.set(1, 1000);
        System.out.println(list);

        // list를 반복을 돈다. "길이"
        System.out.println(list.size());



        ArrayList<String> strings = new ArrayList<>();

        strings.add("1");
        System.out.println(strings);
    }
}
