package org.example.vendingmachine;

public class Manager {

    // 관리자가 재고를 관리하는 로직
    public void itemManagement(Drink drink, int additionalStock) {
       drink.stocks += additionalStock;
        System.out.println(drink.name + "의 재고가 " + additionalStock + "개 추가되었습니다. 현재 재고: " + drink.stocks);
    }

    private  int totalSales = 0;
    
    public void recordSale(int saleAmount) {
        totalSales += saleAmount;
    }

    // 매출 확인 로직
    public void checkSales() {
        System.out.println("현재까지의 총 매출: " + totalSales + "원");
    }

    // 상품 가격 설정 로직
    public void settingProductPrice(Drink drink, int newPrice) {
       drink.price = newPrice;
        System.out.println(drink.name + "의 가격이 " + newPrice + "원으로 설정되었습니다.");
    }

}
