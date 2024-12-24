package org.example.vendingmachine;

import org.example.vendingmachine.products.Drink;
import org.example.vendingmachine.products.Snack;

public class Main {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();

        // 음료수 추가
        vm.addProduct(new Drink("cola", 1000, 10, true));
        vm.addProduct(new Drink("fanta", 1500, 5, false));

        vm.displayDrinks();
        System.out.println("@@@");

        // 스낵 추가
        vm.addProduct(new Snack("chocobar", 1500, 20, 200));
        vm.addProduct(new Snack("photatochip", 1700, 7, 300));

        vm.diplaySnacks();
        System.out.println("@@@");

        // 모든 상품 출력
//        vm.displayProduct();



        // 음료 추가
//        vm.addDrink(new Drink("cola", 1000, 10));
//        vm.addDrink(new Drink("fanta", 2000, 5));
//
//        System.out.println("drinks");
//        vm.displayDrinks();










//        Drink drink1 = new Drink("cola", 2500, 15);
//        Drink drink2 = new Drink("fanta", 1500, 30);
//        Drink drink3 = new Drink("milk", 3000, 25);
//        Snack snack1 = new Snack("chitos", 2000, 30);
//        Snack snack2 = new Snack("doritos", 2000, 35);
//        Snack snack3 = new Snack("sunchip", 2000, 15);


         }
    }

