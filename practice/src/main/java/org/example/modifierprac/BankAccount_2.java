package org.example.modifierprac;

public class BankAccount_2 {

    private int balance;
    private String password;

//- 계좌 생성 (비밀번호 설정)

    public BankAccount_2(String password) {
        this.balance = 0;
        this.password = password;
    }

    //- 입금
    public void deposit(int amount) {
        if (!validateAmount((amount))) {
            System.out.println("cannot deposit");
            return;
        }
        balance += amount;
        System.out.println(amount + "won is deposited");
        return;
    }

    //- 출금 (비밀번호 확인 필요)
    public void withdraw(int amount, String password) {
        if (!validataPassword(password)) {
            System.out.println("invalid password");
            return;
        }
        if (!validateAmount(amount)) {
            System.out.println("cannot withdraw");
            return;
        }
        if (amount > balance) {
            return;
        }
        System.out.println(amount + " won is withdrawed");
        balance -= amount;
    }


    //- 잔액 조회 (비밀번호 확인 필요)
    public int getBalance(String password) {
        if (!validataPassword(password)) {
            System.out.println("invalid password");
            return -1;
        }
        System.out.println(balance);
        return balance;
    }



    private boolean validateAmount(int amount) {
        return amount > 0;
    }

    private boolean validataPassword(String password) {
        return this.password.equals(password);
    }


//    단, 입금이나 출금시 0원 이하의 금액은 불가능하며,
//    잔액보다 큰 금액은 출금할 수 없다.

    public static boolean validateInitialPassword(String password) {
        if (password.length() >= 4) {
            return true;
        } else {
            System.out.println("비밀번호가 너무 짧아요");
            return false;
        }
    }

}





