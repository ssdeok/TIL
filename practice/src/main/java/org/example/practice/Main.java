package org.example.practice;

import org.example.JavaIntro.PrivateModifier;

public class Main {
    public static void main(String[] args) {
        PrivateModi pm = new PrivateModi();

        System.out.println(pm.publicNum);
        //System.out.println(pm.privateNum);

        pm.publicHi();
        //pm.privateHi();
    }
}
