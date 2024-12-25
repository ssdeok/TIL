package org.example.vendingmachine;

import org.example.vendingmachine.function.Payment;
import org.example.vendingmachine.products.Drink;
import org.example.vendingmachine.products.Product;
import org.example.vendingmachine.products.Snack;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    // 상품 선택(이름)
    public Product selectProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                if (product.getStocks() == 0) {
                    System.out.println(product.getName() + "이(가) 품절되었습니다.");
                    return null;
                }
                return product;
            }
        }
        System.out.println("해당 이름의 상품이 없습니다.");
        return null;
    }

    // 결제 처리
    public void processPayment(Payment payment, Product product, int quantity) {
        try {
            payment.pay(product.getPrice());
            product.reduceStocks(quantity);
            System.out.println(product.getName() + " 구매 완료!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    //    private List<Drink> drinks = new ArrayList<>();
//    private List<Snack> snacks = new ArrayList<>();



//    // 상품 추가
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    // 모든 상품 출력
//    public void displayProduct() {
//        for (Product product : products) {
//            for (Product product1 : products) {
//                product1.productInfo();
//            }
//        }
//    }
//
//    // 음료수만 출력
//    public void displayDrinks() {
//        System.out.println("drinks");
//        for (Product product : products) {
//            if (product instanceof Drink) {
//                product.productInfo();
//            }
//        }
////        products.stream()
////                .filter(product -> product instanceof Drink)
////                .forEach(Product::productInfo);
////    }
//
//    }
//
//    // 스낵만 출력
//    public void diplaySnacks() {
//        System.out.println("snakcs");
//        for (Product product : products) {
//            if (product instanceof Snack) {
//                product.productInfo();
//            }
//        }
//        products.stream()
//                .filter(product -> product instanceof Snack)
//                .forEach(Product::productInfo);
//    }

//    public void processPayment(Payment paymentProceesor, int productPrice) {
//        paymentProceesor.payment(productPrice);
//    }


}
