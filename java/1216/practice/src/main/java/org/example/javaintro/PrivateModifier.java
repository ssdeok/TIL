package org.example.javaintro;

public class PrivateModifier {
    public int publicNum = 1;
    private int privteNum = 10;
    int defulatNum = 100;

    public int getPrivteNum() {
        return privteNum;
    }

    public void setPrivteNum(int privteNum) {
        this.privteNum = privteNum;
    }




    public void publicHi(){
        System.out.println("hi, public");
    }

    private void privateHi(){
        System.out.println("hi, private");
    }

    public void sayHi(){
        privateHi();
    }
}
