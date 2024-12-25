package org.example.vendingmachine.people;

import org.example.vendingmachine.VendingMachine;
import org.example.vendingmachine.function.Payment;
import org.example.vendingmachine.products.Product;

public class BuyingUser {
    private VendingMachine vendingMachine;

    public BuyingUser(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    // 상품 구매(이름)
    public void buyProduct(String productName, Payment payment, int quantity) {
        Product product = vendingMachine.selectProduct(productName);
        if (product != null) {
            vendingMachine.processPayment(payment, product, quantity);
        }
    }

    // 잔액 확인
//    private boolean checkBalance() {
//
//    }


//    private void calculateChange() {
//        System.out.println("거스름돈 계산");
//    }
}
