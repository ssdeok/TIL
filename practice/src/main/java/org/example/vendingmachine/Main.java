package org.example.vendingmachine;

import org.example.vendingmachine.function.Card;
import org.example.vendingmachine.function.Cash;
import org.example.vendingmachine.function.Payment;
import org.example.vendingmachine.people.BuyingUser;
import org.example.vendingmachine.products.Drink;
import org.example.vendingmachine.products.Product;
import org.example.vendingmachine.products.Snack;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        // 자판기 초기화
        VendingMachine vm = new VendingMachine(
                Arrays.asList(
                        new Drink("cola", 1500, 10, true),
                        new Snack("chitos", 1000, 7, 200)
                )
        );

        // 사용자 생성
        BuyingUser user = new BuyingUser(vm);


        Scanner scanner = new Scanner(System.in);

        // 자판기 상품 목록 출력
        System.out.println("자판기 상품 목록");
        for (Product product : vm.getProducts()) {
            System.out.println("- " + product.getName() + " (" + product.getPrice() + "원, 재고: " + product.getStocks() + ")");
        }

        // 사용자 입력
        System.out.println("구매할 상품 이름을 입력하세요: ");
        String productName = scanner.nextLine();

        System.out.println("구매할 수량을 입력하세요: ");
        int stocks = scanner.nextInt();
        scanner.nextLine();

        System.out.println("결제 방식을 선택하세요 (1: 현금, 2: 카드): ");
        int payChoice = scanner.nextInt();

        Payment payment;
        if (payChoice == 1) {
            System.out.println("투입할 금액을 입력하세요: ");
            int cashAmount = scanner.nextInt();
            payment = new Cash(cashAmount);
        } else {
            System.out.println("카드 잔액을 입력하세요: ");
            int cardBalance = scanner.nextInt();
            payment = new Card(cardBalance);
        }

        // 상품 구매 처리
        Product product = vm.selectProduct(productName);
        if (product != null) {
            vm.processPayment(payment, product, stocks);
        } else {
            System.out.println("선택한 상품이 존재하지 않습니다.");
        }

        scanner.close();

//
//        // 현금 결제 테스트
//        Payment cashPayment = new Cash(2000);
//        vm.processPayment(cashPayment, 1500);
//
//        // 카드 결제 테스트
//        Payment cardPayment = new Card();
//        vm.processPayment(cardPayment, 1500);


        // 음료수 추가
//        vm.addProduct(new Drink("cola", 1000, 10, true));
//        vm.addProduct(new Drink("fanta", 1500, 5, false));
//
//        vm.displayDrinks();
//        System.out.println("@@@");
//
//        // 스낵 추가
//        vm.addProduct(new Snack("chocobar", 1500, 20, 200));
//        vm.addProduct(new Snack("photatochip", 1700, 7, 300));
//
//        vm.diplaySnacks();
//        System.out.println("@@@");

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

