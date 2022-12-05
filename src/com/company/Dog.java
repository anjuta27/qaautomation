package com.company;

public class Dog {  //конструктор без аргументов
    String name;
    int age;

    public Dog() {

    }

    public Dog(String name, int age) { //конструктор с аргументами
        this.name = name;
        this.age = age;
    }

    public void sayGav() {          //метод без параметров
        System.out.println("Гав!");
    }

    public String sayRRR() { //метод без параметром с возвращением
        return "RRRR";
    }

    public void dogsAges(int one, int two) { //методы не возвращающие значение
        System.out.println("Возраст двух собак " + one + " и " + two + " года");
    }

    public int dogsAgesInSum (int one, int two) { //метод возвращающие значение

        return one + two;
    }
}