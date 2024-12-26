package org.example.vendingmachine.function;

public class Card implements Payment {
    private  int cardBalance;

    public Card(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    @Override
    public void pay(int productPrice) {
        if (cardBalance >= productPrice) {
            cardBalance -= productPrice;
            System.out.println("카드 결제 완료. 남은 잔액: " + cardBalance + "원");
            return;
        } else {
            System.out.println("카드 잔액이 부족합니다.");
        }
        System.out.println("카드 잔액이 부족합니다.");
        return;
    }
}
