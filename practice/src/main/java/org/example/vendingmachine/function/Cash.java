package org.example.vendingmachine.function;

public class Cash implements Payment {
    private int insertedMoney;

    public Cash(int insertedMoney) {
        this.insertedMoney = insertedMoney;
    }

    @Override
    public void pay(int productPrice) {
        if (insertedMoney >= productPrice) {
            System.out.println("현금으로 " + productPrice + "원 결제 완료");
            calculChange(productPrice);
        } else {
            System.out.println("투입 금액이 부족합니다. 금액을 추가로 넣어주세요.");
        }
//        System.out.println("현금으로 " + amount + "원 결제 완료");
    }

    private void calculChange(int productPrice) {
        int change = insertedMoney - productPrice;
        System.out.println("거스름돈: " + change + "원");
    }
}
