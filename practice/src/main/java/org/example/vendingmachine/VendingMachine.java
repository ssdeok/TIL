package org.example.vendingmachine;

import org.example.vendingmachine.function.CardPayment;
import org.example.vendingmachine.function.CashPayment;
import org.example.vendingmachine.products.Drink;
import org.example.vendingmachine.products.Product;
import org.example.vendingmachine.products.Snack;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements CardPayment, CashPayment {

//    private List<Drink> drinks = new ArrayList<>();
//    private List<Snack> snacks = new ArrayList<>();

    private List<Product> products = new ArrayList<>();

    // 상품 추가
    public void addProduct(Product product) {
        products.add(product);
    }

    // 모든 상품 출력
    public void displayProduct() {
        for (Product product : products) {
            for (Product product1 : products) {
                product1.productInfo();
            }
        }
    }

    // 음료수만 출력
    public void displayDrinks() {
        System.out.println("drinks");
        for (Product product : products) {
            if (product instanceof Drink) {
                product.productInfo();
            }
        }
//        products.stream()
//                .filter(product -> product instanceof Drink)
//                .forEach(Product::productInfo);
//    }

    }

    // 스낵만 출력
    public void diplaySnacks() {
        System.out.println("snakcs");
        for (Product product : products) {
            if (product instanceof Snack) {
                product.productInfo();
            }
        }
//        products.stream()
//                .filter(product -> product instanceof Snack)
//                .forEach(Product::productInfo);
    }

    @Override
    public void cardpayment() {

    }

    @Override
    public void cashpayment() {

    }
}
