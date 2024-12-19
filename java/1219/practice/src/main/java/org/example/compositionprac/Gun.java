package org.example.compositionprac;

public class Gun extends Weapon implements SpecialAttackable{

//    public SpecialAttack specialAttck;

    public Gun(int power, int stemina) {
        super(power, stemina);
    }

    @Override
    public void specialAttack() {
        System.out.println("shoot a gun");
    }
}
