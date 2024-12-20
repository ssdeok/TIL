package org.example.javaintro;

import org.example.javaintro.tmp.DefaultModifier;

public class Main {
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();

        pm.publicNum = 1000000;
        System.out.println(pm.publicNum);

//        System.out.println(pm.privteNum);
        System.out.println(pm.getPrivteNum());
        pm.setPrivteNum(100);
        System.out.println(pm.getPrivteNum());

        System.out.println(pm.defulatNum);
        pm.publicHi();
//        pm.privateHi();
        pm.sayHi();

        DefaultModifier dm = new DefaultModifier();

        System.out.println(dm.publicString);
//        System.out.println(dm.defualtString);
    }
}
