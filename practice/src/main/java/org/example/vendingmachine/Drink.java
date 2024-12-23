package org.example.vendingmachine;

public class Drink{
    public String name;
    public int price;
    public int stocks;

    public Drink(String name, int price, int stocks) {
        this.name = name;
        this.price = price;
        this.stocks = stocks;
    }

    // 상품 정보 출력 메서드. 사용자와 관리자 모두 상품 정보 확인
    public void displayInfo() {
        System.out.println("상품명: " + name + ", 가격: " + price + "원, 재고: " + stocks + "개");
    }
}

