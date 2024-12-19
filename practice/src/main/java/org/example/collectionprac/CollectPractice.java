package org.example.collectionprac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectPractice {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        HashMap<String, String> array2 = new HashMap<>();

        HashSet<String> set = new HashSet<>();

        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(30);
        array3.add(20);
        array3.add(10);
        System.out.println(array3);

        int i = array3.get(0) + array3.get(1) + array3.get(2);
        System.out.println(i);

        int j = (array3.get(0) + array3.get(1) + array3.get(2)) / 3;
        System.out.println(j);


    }

}
