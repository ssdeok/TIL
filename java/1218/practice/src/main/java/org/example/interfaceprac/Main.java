package org.example.interfaceprac;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle.calcuateArea());
        rectangle.test();
        rectangle2.test();

        Shape triangle = new Triangle();
        System.out.println(triangle.calcuateArea());

//        Shape shape = new Shape(); // 불가능

//        카카오결제 카결 = new 카카오결제()
//        네이버결제 카결 = new 네이버결제()
//        페이팔결제 카결 = new 페이팔결제()
//        비트코인결제 카결 = new 비트코인결제()
//
//        결제 아무결제 = new 아무결제()

        Dog dog = new Dog("happy", 18, "puddle");
        dog.makeSound();

        Cat cat = new Cat("cat", 3);
        cat.makeSound();

        makeThemSound(dog);
        makeThemSound(cat);
    }

    public static void makeThemSound(Animal animal){

        System.out.println("cry!");
        animal.makeSound();
    }

//    public static void makeThemSound(Dog dog){
//        System.out.println("cry!");
//        dog.makeSound();
//    }
//    public static void makeThemSound(Cat cat){
//        System.out.println("cry!");
//        cat.makeSound();
//    }

//    void 결제(int 네이버결제){
//        네이벼결제.결제()
//    }
//    void 결제(double 카카오결제){
//        카카오결제.결제()
//    }
//
//    void 결제(결제 아무결제){
//        아무결제.결제()
//    }

//    new Animal(); // 불가능

}
