package org.example.modifierprac;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("beemo", 18, 182.1);

//        System.out.println(p.name);
        System.out.println(p.getName());
        System.out.println(p.age);
        System.out.println(p.height);

//        p.name = "ken";
        p.setName("ken");
        p.age = 20;
        p.height = 175.3;

        System.out.println(p.getName());
        System.out.println(p.age);
        System.out.println(p.height);

//        p.run();
        p.exercise();
        p.walk();
        p.study();




        BankAccount myAccount = new BankAccount("abc123");
        myAccount.deposit(100000);
        myAccount.getBalance("abc123");
        myAccount.withdraw(10000, "abc123");
        myAccount.getBalance("abc123");

        myAccount.getBalance("hahahoho");

        System.out.println();

        String myPassword = "abc";
        if (BankAccount.validateInitialPassword(myPassword)) {
            System.out.println("fail.");
        } else {
            new BankAccount(myPassword);
        }
    }

}
