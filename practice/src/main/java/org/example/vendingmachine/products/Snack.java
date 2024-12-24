package org.example.vendingmachine.products;

public class Snack extends Product {

    // 스낵의 칼로리 (고유 속성)
    private int calories;

    public Snack(String name, int price, int stocks, int c) {
        super(name, price, stocks);
        this.calories = calories;
    }

    @Override
    public void productInfo() {
        System.out.println("snack - name: " + getName() + ", price: " + getPrice() + ", stocks: " + getStocks() + ", calories: " + calories);
    }
//    private String name;
//    private int price;
//    private int stocks;
//
//    public Snack(String name, int price, int stocks) {
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
}
