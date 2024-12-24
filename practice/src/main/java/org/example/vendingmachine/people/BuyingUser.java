package org.example.vendingmachine.people;

import org.example.vendingmachine.function.CardPayment;
import org.example.vendingmachine.function.CashPayment;

public class BuyingUser implements CardPayment, CashPayment {

    // 일반 사용자가 상품을 구매하는 로직
    public void purchaseProducts() {

    }


    // 카드 결제 처리
    @Override
    public void cardpayment() {

    }

    // 잔액 확인
//    private boolean checkBalance() {
//
//    }

    @Override
    public void cashpayment() {

    }

//    private void calculateChange() {
//        System.out.println("거스름돈 계산");
//    }
}
