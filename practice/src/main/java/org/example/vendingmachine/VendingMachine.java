package org.example.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine implements CardPayment, CashPayment {

    public Drink drink;
    public Snack snack;

    // 자판기 상품 관리
    private Map<String, VendingMachine> products = new HashMap<>();
    private int sales = 0;

    @Override
    public void cardpayment() {
        checkBalance();
        System.out.println("카드 결제");
    }

    @Override
    public void cardpayment(int amount) {

    }

    @Override
    public void cashpayment(int cash, int totalPrice) {

    }

    private void checkBalance() {
        System.out.println("잔액 부족 확인");
    }

    @Override
    public void cashpayment() {
        System.out.println("현금 결제");
        calculateChange();
    }

    private void calculateChange() {
        System.out.println("거스름돈 확인");
    }

}
