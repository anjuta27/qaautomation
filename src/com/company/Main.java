package com.company;


import java.util.Scanner;

public class Main {


    //1.1 Вывести в консоль максимальное и минимальное значения типа int, используя класс Integer
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        int max = Integer.MAX_VALUE;
        System.out.println(max);

    //1.2 В переменную записать 3х значное натуральное число, вывести в консоль сумму цифр числа
        int number = 300;
        System.out.println(number + number);
    //1.3 В переменные x и y записать два натуральных числа, вывести в консоль остаток от деления x и y
        int x = 5;
        int y = 3;
        System.out.println(x % y);
        square();
    }


//1.4 Напишите метод, который будет вычислять площадь прямоугольника и выводить результат в консоль, вызовите этот из main
    public static void square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сторона а ");
        int a = scanner.nextInt();
        System.out.println("Сторона б ");
        int b = scanner.nextInt();
        int squareResult = a * b;
        System.out.println(" Площадь прямоугольника " + squareResult);
    }

}














