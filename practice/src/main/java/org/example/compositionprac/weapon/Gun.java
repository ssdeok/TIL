package org.example.compositionprac.weapon;

public class Gun {

    public Weapon weapon;

    public Gun(Weapon weapon) {
        this.weapon = weapon;
    }

    public void specialAttak() {
        System.out.println("Gun Special Attack " + weapon.getAp());
    }
}
