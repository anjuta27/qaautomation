package com.company;

public class Zoo {
    public static void main(String[] args) {

     Dog dog = new Dog("Stasik",5);
     Dog dog2 = new Dog();
     dog2.name = "Arturik";
     dog2.age  = 2;
     System.out.println("Собачка по имени " + dog.name + " в возрасте  " + dog.age + "лет ");
     System.out.println("Вторая собачка по имени "+ dog2.name + " в возрасте " + dog2.age + " года");
     dog.sayGav();
     dog2.sayGav();
     String dogVoice = dog.sayRRR();
     System.out.println(dogVoice);
     dog2.dogsAges(5,2);
     int result = dog.dogsAgesInSum(2,5);
     System.out.println(result);
    }
}
