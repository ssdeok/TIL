package org.example.exceptionpract;

public class Main {
    public static void main(String[] args) {
        
        // TODO 에러추가
        try {
            System.out.println( 0/0 );
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("error!");
        }

        try {
            // 문제상황이 발생했다고 가정하자.
            // if (스페셜어택이 불가능하면)
            if (true) {
                throw new RuntimeException("error message");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("runtime error!");
        }



    }
}
