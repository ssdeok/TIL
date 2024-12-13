package org.example.javaintro;

public class Dog {
    public static int count;
    public String breed;
    public String name;

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
        count++;
    }

    public void seat(){
//        나, name. 앉았다.
//        System.out.println("앉았다!");
        System.out.println("me, " + this.name + " seated");
    }

    // 아무것도 입력 안받을꺼야 / 손 이라는걸 출력할꺼야 / 아무것도 return 안할꺼야
    // 함수 만들기 전에 미리 생각을 하고 만드는 것이 "무조건" 좋다
    public void hand(){
        System.out.println("here, hand");
    }

    public static void hi(){
        System.out.println("hi");

    }

}
