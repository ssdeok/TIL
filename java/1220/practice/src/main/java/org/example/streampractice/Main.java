package org.example.streampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<Integer>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);

//        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));

        List<Integer> list = new ArrayList<Integer>(List.of(3, 1, 2, 2, 4));
        System.out.println(list);

        Stream<Integer> stream = list.stream();

        List<Integer> over1List = list.stream() // list를 stream으로 변경
                .filter(x -> x > 1) // filter 적용
                .map()
                .mapToInt()
                .collect(Collectors.toList());// List로 변경

        System.out.println(over1List);


        Stream<String> strings = Stream.of("a", "b", "c");

        Stream<String> upper = strings.map(string -> string.toUpperCase());

        System.out.println(upper.toList());
// "A", "B", "C"를 갖는 스트림
    }
}
