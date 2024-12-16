package org.example.inheritanceprac;

public class Dog  extends Animal{
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void soundOn() {
        // 여기서 name을 어떻게 바꾸면 Animal의 name이 자동으로 protected로 바뀜
        // 빨간글씨에서 alt + enter
        System.out.println(name + "wang wang");
    }
}
