package org.example.interfaceprac;

// 추상 클래스야. 즉 너를 상속받는 다른 클래스들에게
// 니가 가지고 있는 것들을 구현하도록 강제할꺼야.
public abstract class Shape {
    public int width;
    public int height;


    public abstract int calcuateArea();

    public void test(){
        System.out.println("test");
    }
}
