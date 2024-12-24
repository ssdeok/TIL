package org.example.streampractice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> integers = new ArrayList<Integer>();


        List<Integer> list = new ArrayList<Integer>(List.of(3, 1, 2, 2, 4));
        System.out.println(list);

        List<Integer> over1List = list.stream()
                .filter(x -> x > 1)
                .collect(Collectors.toList());

        System.out.println(over1List);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        // 짝수만 필터링하여 리스트 반환
        // filter는 걸러내는거
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 모든 숫자에 2를 곱하여 리스트 반환
        // map은 변환하는거
        List<Integer> secondNum = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(secondNum);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 숫자들의 합계 계산
        // 목표가 단일 값(합계, 평균 등)이니까 List로 변수를 줄 필요 없음
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 5보다 큰 숫자의 개수 계산

//        int num5 = (int) numbers.stream()
//                .filter(n -> n > 5)
//                .mapToInt(Integer::intValue)
//                .count();

        // count()는 항상 long 타입 반환.
        // 개수만 반환하므로 변환 필요없어서 inValue같은거 안써도됨
        long num5 = numbers.stream()
                .filter(n -> n > 5)
                .count(); // 5

        System.out.println(num5);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        List<String> words = Arrays.asList("apple", "banana", "cherry", "fineapple", "apple");


        // 길이가 5이상인 단어들만 필터링하여 리스트 반환

        List<String> fiveWords = words.stream()
                .filter(n -> n.length() >= 5)
                .toList();

        System.out.println(fiveWords);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 모든 단어들을 대문자로 변환하여 리스트 반환

        List<String> upWords = words.stream()
                .map(n -> n.toUpperCase())
                .toList();

        System.out.println(upWords);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 중복된 단어 제거하고 알파벳 순 정렬하여 리스트 반환
     List<String> disWords = words.stream()
             .distinct()
             .sorted()
             .toList();

        System.out.println(disWords);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 각 단어의 길이를 리스트로 변환
        List<Integer> lengWords = words.stream()
                .map(String::length)
                .toList();

        System.out.println(lengWords);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

            List<Product> products = Arrays.asList(
//                    new Product("notebook", 1200000, "SALE"),
//                    new Product("mouse", 50000, "SALE"),
//                    new Product("keyboard", 150000, "SOLD_OUT"),
//                    new Product("monitor", 350000, "SOLD_OUT"),
//                    new Product("speaker", 400000, "SALE")
            );
            // 상품들의 이름 리스트 반환
            List<String> nameList = products.stream()
                    .map(Product::getName)
                    .toList();

            System.out.println(nameList);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

            // 20만원 이상인 상품들의 이름 리스트 반환
            List<String> twentyProducts = products.stream()
                    .filter(p->p.getPrice() >= 200000)
                    .map(Product::getName)
                    .toList();

        System.out.println(twentyProducts);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 판매중인 상품의 가격 합
       int sumPrice = products.stream()
                .filter(p->p.getStatus().equals("SALE"))
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println(sumPrice);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

        // 판매 중이면서 20만원 이상인 상품들의 이름 리스트 반환
        List<String> twentySaleProducts = products.stream()
                .filter(p->p.getStatus().equals("SALE"))
                .filter(p->p.getPrice() >= 200000)
                .map(Product::getName)
                .toList();
        System.out.println(twentySaleProducts);

        }
    }
