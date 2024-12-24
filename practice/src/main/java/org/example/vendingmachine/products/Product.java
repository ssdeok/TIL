package org.example.vendingmachine.products;

public abstract class Product {
    private String name;
    private int price;
    private int stocks;

    public Product(String name, int price, int stocks) {
        this.name = name;
        this.price = price;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStocks() {
        return stocks;
    }

    public void reduceStocks(int quantity) {
        if (stocks >= quantity) {
            stocks -= quantity;
        } else {
            System.out.println("stocks empty");
        }
    }

    // 추상 메서드: 상품 정보를 출력하는 메서드는 하위 클래스에서 구현해야 함
    public abstract void productInfo();
}
