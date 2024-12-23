package org.example.vendingmachine;

public class Main {
    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            String word1 = scanner.next();
//            String word2 = scanner.next();
//
//            System.out.println(word1);
//            System.out.println(word2);

            VendingMachine vend = new VendingMachine();
            vend.cardpayment();
            vend.cashpayment();

        System.out.println("@@@@@@@@@@@@@");

            BuyingUser buyingUser = new BuyingUser();
            buyingUser.cardpayment();



        System.out.println("@@@@@@@@@@@@@");

        Manager manager = new Manager();
        manager.itemManagement();

        System.out.println("@@@@@@@@@@@@@");

        Drink drink1 = new Drink("cola", 2500, 15);
        Drink drink2 = new Drink("fanta", 1500, 30);
        Drink drink3 = new Drink("milk", 3000, 25);
        Snack snack1 = new Snack("chitos", 2000, 30);
        Snack snack2 = new Snack("doritos", 2000, 35);
        Snack snack3 = new Snack("sunchip", 2000, 15);


    }
    }

