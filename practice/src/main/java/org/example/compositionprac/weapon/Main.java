package org.example.compositionprac.weapon;

public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon(50, 100);

        Gun gun = new Gun(weapon);

        gun.specialAttak();

        Sword sword = new Sword(weapon);
        sword.specialAttack();
    }
}
