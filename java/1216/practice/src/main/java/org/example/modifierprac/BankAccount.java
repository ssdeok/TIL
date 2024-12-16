package org.example.modifierprac;

public class BankAccount {
    private int balance;
    private String password;

    //- 계좌 생성 (비밀번호 설정)
    public BankAccount(String password) {
        this.password = password;
        this.balance = 0;
    }

    //- 입금
    // input : 입금할 금액 / balance를 키움
    // / balance를 return{할까 하다가, 이미 getter가 존재하기 때문에 void를 return하자
    public void deposit(int amount){
        if (!validateAmount(amount)){
            System.out.println("cannot deposit");
            return;
        }
        balance += amount;
        System.out.println(amount + " won is deposited");
    }

//    public int deposit(int amount){
//        if (validateAmount(amount)){
//            System.out.println("입금 불가 금액임");
//            return balance;
//        }
//
//        System.out.println(amount + "원이 입금됨");
//        return balance;
//    }



//- 출금 (비밀번호 확인 필요)
    // input : 출금할 금액 / 비밀번호  // 비밀번호 체크 / 잔액을 balance만큼 줄임 / return void(또는 int)

    public void withdraw(int amount, String password) {
//        비밀번호 확인
        if (!validatePassword(password)) {
            System.out.println("invalid password");
            return;
        }

        // 금액 확인
        if (!validateAmount(amount)){
            System.out.println("cannot withdraw");
            return;
        }
        // 출금 금액이 잔고보다 많으면 안됨
        if (amount > balance){
            return;
        }
        System.out.println(amount + " won is withdrawed");
        balance -= amount;
    }

//- 잔액 조회 (비밀번호 확인 필요)
    public int getBalance(String password) {
        // 비밀번호 확인
        if (!validatePassword(password)) {
            // 처리 첫번째 : 의미 없는 값을 return (대신, typing에 맞춰서)
            System.out.println("invalid password");
            return -1;
            // 처리 두번째 : 에러 핸들링을 한다
        }
        System.out.println(balance);
        return balance;
    }


//    private boolean validateAmount(int amount, int minAmount){
//        if (amount > minAmount){
    private boolean validateAmount(int amount){
        return amount > 0;
//        if (amount > 0){
//            return true;
//        } else{
//            System.out.println("under 0 impossible");
//            return false;
//        }
    }

    private boolean validatePassword(String password){
        return this.password.equals(password);

//        if (this.password.equals(password)){
//            return true;
//        } else{
//            System.out.println("invalid password");
//            return false;
//        }
    }

//
//단, 입금이나 출금시 0원 이하의 금액은 불가능하며,
//잔액보다 큰 금액은 출금할 수 없다.

    // 생성시 비밀번호 체크

    public static boolean validateInitialPassword(String password){
        if (password.length() >= 4){
            return true;
        } else {
            System.out.println("비밀번호가 너무 짧아요");
            return false;
        }

    }
}
