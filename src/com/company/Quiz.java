package com.company;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Чувак привет отгадай пару вопросов ");
        String questionNumberOne = "Скока будет два плюс два?";
        System.out.println(questionNumberOne);
        Scanner number = new Scanner(System.in);
        String answer1 = number.nextLine();
        int intNumber = Integer.parseInt(answer1);
        if (intNumber == 4) {
            System.out.println("Верно ты крут ");
        } else{
            System.out.println("Подумай милинький ");
        }
        String questionNumberTwo = "Окей, второй вопрос 1+1?  ?";
        System.out.println(questionNumberTwo);
        Scanner number2 = new Scanner(System.in);
        String answer2 = number2.nextLine();
        int intNumber2=Integer.parseInt(answer2);
        if (intNumber2 == 2);
            System.out.println(" Ты крут бессомненно!!!");



        }
}

