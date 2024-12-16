package org.example.JavaIntro;

import org.example.JavaIntro.Temp.DefualtModifier;


public class Main {
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();

        pm.publicNum = 1000000;
        System.out.println(pm.publicNum);

       // System.out.println(pm.privateNum);
//        System.out.println(pm.getPrivateNum());
//        pm.setPrivateNum(100);
//        System.out.println(pm.getPrivateNum());

        System.out.println(pm.defailtNum);
        pm.publicHi();
      //  pm.privateHi();
        pm.sayHi();

        DefualtModifier dm = new DefualtModifier();

        System.out.println(dm.publicString);
//        System.out.println(dm.defualtString);


        Dog_2 dt = new Dog_2("jindo", "hodoo");
        dt.seat();
        dt.hand();
    }
}
