package org.example.vendingmachine.people;

import org.example.vendingmachine.VendingMachine;
import org.example.vendingmachine.products.Product;

public class Manager {
private VendingMachine vendingMachine;

    public Manager(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    // 상품 추가
//    public void addProduct(Product product) {
//        vendingMachine.addProduct(product);
//        System.out.println("상품이 추가되었습니다: " + product.getName());
//    }


    // 관리자가 재고를 관리하는 로직
    public void itemManagement() {

    }


    // 매출 확인 로직
    public void checkSales() {
    }

    // 상품 가격 설정 로직
    public void settingProductPrice() {

    }

}
