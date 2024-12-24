package org.example.vendingmachine.products;

public class Drink extends Product {

    // 음료의 탄산 여부 (고유 속성)
    private boolean isCarbonated;

    public Drink(String name, int price, int stocks, boolean b) {
        super(name, price, stocks);
        this.isCarbonated = isCarbonated;
    }


    @Override
    public void productInfo() {
        System.out.println("drink - name: " + getName() + ", price: " + getPrice() + ", stocks: " + getStocks() + ", carbonated: " + isCarbonated);
    }
//    private String name;
//    private int price;
//    private int stocks;
//
//    public Drink(String name, int price, int stocks) {
//        this.name = name;
//        this.price = price;
//        this.stocks = stocks;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public int getStocks() {
//        return stocks;
//    }

    //    // 상품 정보 출력 메서드. 사용자와 관리자 모두 상품 정보 확인
//    public void displayInfo() {
//
//    }
}

