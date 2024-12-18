package org.example.interfaceprac.character;

import org.example.inheritanceprac.Worrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        System.out.println(warrior.level);

        warrior.attack();

        warrior.increaseRage(100);

        warrior.attack();

        Mage mage = new Mage();
        mage.showInfo();
        warrior.showInfo();



        Warrior warrior2 = new Warrior();

        warrior.attack(warrior2);
        warrior.attack(mage);
        mage.showInfo();


    }
}
