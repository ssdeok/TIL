package org.example.vendingmachine;

public class BuyingUser implements CardPayment, CashPayment{

    public void purchaseProducts() {
        // 일반 사용자는 카드로 구매할 수 있고, 현금으로 구매할 수 있다.

    }

    @Override
    public void cardpayment() {
        System.out.println("카드 결제");
    }

    private void checkBalance() {
        System.out.println("잔액 확인");
    }

    @Override
    public void cashpayment() {
        System.out.println("현금 결제");
    }

    private void calculateChange() {
        System.out.println("거스름돈 계산");
    }
}
