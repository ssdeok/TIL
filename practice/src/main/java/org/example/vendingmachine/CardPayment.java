package org.example.vendingmachine;

public interface CardPayment {

    void cardpayment();

    // 카드 결제 처리
    void cardpayment(int amount);

    void cashpayment(int cash, int totalPrice);
}
