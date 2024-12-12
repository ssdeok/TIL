package org.example;

public class Dog {
    String breed;
    String name;

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    void seat(){
//        나, name. 앉았다.
//        System.out.println("앉았다!");
        System.out.println("me, " + this.name + " seated");
    }

    // 아무것도 입력 안받을꺼야 / 손 이라는걸 출력할꺼야 / 아무것도 return 안할꺼야
    // 함수 만들기 전에 미리 생각을 하고 만드는 것이 "무조건" 좋다
    void hand(){
        System.out.println("here, hand");
    }


}
