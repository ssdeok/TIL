package org.example.inheritanceprac;


public class Worrior extends Character {
    private int rage;
    private static final int MAX_RAGE =100;

    public Worrior(String name) {
        super(name);
        this.health = 120;
        this.maxHealth = 120;
        this.rage = 0;
    }


    @Override
    public void attack(){
        System.out.println("attack!");
        rage += 10;

        if (rage >= 50){
            System.out.println("rage attack!");
        }

    }

    public void rageUp(){
        rage += 50;
        System.out.println("rage Up!");
    }


    @Override
    public void levelUp(){
        super.levelUp();
        maxHealth += 30;
        health += 30;
    }
//    - 분노게이지 관련 기능을 추가하시오 (최대 100)
//- 기본 체력은 120입니다
//- 레벨업 시 체력 30 증가
}
