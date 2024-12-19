package org.example.compositionprac;

public abstract class Weapon {
    protected int power;
    protected int stemina;

    public Weapon(int power, int stemina) {
        this.power = power;
        this.stemina = stemina;
    }

//    public void specialAttack(){
//        "불가능해"
//                "오버라이드하면 쓸 수 있어"
//    }
}
