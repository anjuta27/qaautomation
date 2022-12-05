package oop;

public class Main {
    public static void main(String[] args) {

        Cat simka  = new Cat("Серый");
        Dog umka  = new Dog("Чёрный");
        System.out.println("Котёнок по имени Симка имеет " + simka.color + " окрас");
        System.out.println("Собака по имени Умка имеет " + umka.color + " окрас");
        System.out.println("Симка голос ! : " + simka.sayMeow());
        System.out.println("Умка голос ! : " + umka.sayGav());

    }
}
