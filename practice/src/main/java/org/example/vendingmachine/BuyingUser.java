package org.example.vendingmachine;

public abstract class BuyingUser implements CardPayment, CashPayment{

    // 일반 사용자가 상품을 구매하는 로직
    public void purchaseProducts(Drink drink, int quantity, boolean isCardPayment) {
        // 일반 사용자는 카드로 구매할 수 있고, 현금으로 구매할 수 있다.
        if (drink.stocks < quantity) {
            System.out.println("재고가 부족합니다.");
            return;
        }

        int totalPrice = drink.price * quantity;

        if (isCardPayment) {
            if (!checkBalance(totalPrice)) {
                System.out.println("잔액이 부족합니다. 결제가 취소됩니다.");
                return;
            }
            cardpayment(totalPrice);
        } else {
            int cash = 5000; //사용자가 입력한 현금
            if (cash < totalPrice) {
                System.out.println("현금이 부족합니다. 결제가 취소됩니다.");
                return;
            }
            cashpayment(cash, totalPrice);
        }

        drink.stocks -= quantity; // 재고 차감
        System.out.println(quantity + "개의 " + drink.name + "를 구매하셨습니다.");
    }


    // 카드 결제 처리
    @Override
    public void cardpayment(int amount) {
        System.out.println("카드로 " + amount + "원이 결제되었습니다.");
    }

    // 잔액 확인
    private boolean checkBalance(int amount) {
        int cardBalance = 10000; // 카드 잔액
       return cardBalance >= amount;
    }

    @Override
    public void cashpayment(int cash, int totalPrice) {
        int change = cash - totalPrice;
        System.out.println("현금으로 " + totalPrice + "원이 결제되었습니다. 거스름돈: " + change + "원");
    }

//    private void calculateChange() {
//        System.out.println("거스름돈 계산");
//    }
}
