package org.example.vendingmachine;

public class VendingMachine implements CardPayment, CashPayment {

    public Drink drink;
    public Snack snack;

    @Override
    public void cardpayment() {
        checkBalance();
        System.out.println("카드 결제");
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
