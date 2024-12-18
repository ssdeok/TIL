package org.example.compositionprac.weapon;

public class Sword {

    public Weapon weapon;

    public Sword(Weapon weapon) {
        this.weapon = weapon;
    }

    public void specialAttack() {
        System.out.println("Sword Special Attack " + weapon.getAp());
    }
}
