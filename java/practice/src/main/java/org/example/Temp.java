package org.example;

public class Temp {
    int value;
    String word;

    public static void main(String[] args) {
        Temp tmp = new Temp(10, "h");
        tmp.show();
    }

    public Temp(int value, String word) {
        this.value = value;
        this.word = word;
    }

    void show(){
        System.out.println(value + word);
        System.out.println(this.value + this.word);
    }
}
