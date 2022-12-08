
package oop;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Massive {

    public static void main(String[] args) {

        Massive massive = new Massive();
        massive.task3();
        massive.task1();


    }

    //1.3
    //Создать массив, в котором содержатся строки с временами года.
    // При помощи конструкции switch-case сделать вывод в консоль месяцев, соответствующих времени года.
    // Выбор времени года реализовать через псевдорандом Math.
    private void task3() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Зима");
        arrayList.add("Лето");
        arrayList.add("Осень");
        arrayList.add("Весна");
        int seasonNumber = new Random().nextInt(arrayList.size());
        switch (seasonNumber) {
            case 0:
                System.out.println("Декабрь, Январь, Февраль");
                break;
            case 1:
                System.out.println("Март, Апрель, Май");
                break;
            case 2:
                System.out.println("Июнь, Июль, Август");
                break;
            case 3:
                System.out.println("Сентябрь, Октябрь, Ноябрь");
                break;
        }
    }

    private void task1() {
        //task1
        //Создать список ArrayList(динамический массив), заполнить строками, вводимыми пользователем через консоль (до 10 штук).
        // Вывести в консоль строку, содержащую заглавную букву
        //Найти наименьшую и наибольшую по длине строку в списке
        //Удалить из списка наименьшую и наибольшую строки
        //Вывести содержимое списка в консоль

        int mathRandom = (int) (Math.random() * 10);
        System.out.println(mathRandom);
        Random randomizer = new Random();
        int randRandom = randomizer.nextInt();
        int randRandomBound = randomizer.nextInt(10);
        System.out.println(mathRandom);
        System.out.println(randRandom);
        System.out.println(randRandomBound);

        int[] randomArray = new int[10];  //заполнить массив случайными числами используя псевдорандом из Math.
        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomizer.nextInt(10);
            System.out.println("Значение массива: " + randomArray[i]);
        }

        //Найти наименьшее и наибольшее число в массиве
        int maxValue = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > maxValue) {
                maxValue = randomArray[i];
            }
            System.out.println("Максимальное значение: " + maxValue);
        }

        int minValue = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < minValue) {
                minValue = randomArray[0];
            }
            System.out.println("Минимальное значение: " + minValue);
        }
        //Найти суммы чисел массива
        int sum = 0;
        for (int i : randomArray) {
            sum += i;
            System.out.println(sum);

        }
        //Выбрать только четные числа и записать их в новый массив
        int[] evenArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0 && randomArray[i] != 0) {
                evenArray[i] = randomArray[i];
                System.out.println("Четное значение: " + randomArray[i]);



            }
        }
    }
}
