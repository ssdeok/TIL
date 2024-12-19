package org.example.compositionprac.weapon;

public class Sword extends Weapon implements SpecialAttackable {


    public Sword(int ap, int stamina) {
        super(ap, stamina);
    }


    @Override
    public void specialAttack() {
        System.out.println("slice!");
    }
}
