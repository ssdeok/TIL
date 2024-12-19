package org.example.compositionprac.weapon;

public class Gun extends Weapon implements SpecialAttackable {


    public Gun(int ap, int stamina) {
        super(ap, stamina);
    }

//    public void specialAttak() {
//        System.out.println("Gun Special Attack " + weapon.getAp());
//    }

    @Override
    public void specialAttack() {
        System.out.println("shoot a gun");
    }
}
