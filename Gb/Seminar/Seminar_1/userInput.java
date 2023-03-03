package Gb.Seminar.Seminar_1;

/**
 * 1. написать программу, которая запрвшивает у пользователя имя и далее выводит
 * приветствие и имя на экран.
 * 2. Запросить системное время и попрриветствовать пользователя в зависимости
 * от времени.
 * 
 */
import java.util.Scanner;

import java.time.LocalDateTime;

public class userInput {
    public static void main(String[] args) {
        // Scanner scn:
        // объявляем переменную scn типа Scanner, или другими словами- преременная
        // которая ссылается на обект класса Scanner.
        // В переменной scn хранится ссылка на участок памяти который был выделен
        // программой под объект Scanner.

        // new Scanner
        // оператор new - занимается тем, что говорит виртуальной машине - выдели память
        // под объект класса Scanner,
        // создай его там и верни ссылку на него.

        // new Scanner(System.in)
        // в связи с тем, что Scanner может обрабатывать не только ввод с клавиатуры
        // (еще может принимать из консоли, из строки, файла)
        // Ему необходимо явно указать от куда мы получать будем данные.
        // System.in - это неформальный входной поток байтов (кодов нажатых клавиш на
        // клавиатуре), которые переводятся
        // Scanner-ом в данные, которые нам нужны
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите свое имя ");
        // String userName - объявление переменной типа string
        // scn.next() - вызов МЕТОДА next() ОБЪЕКТА Scanner
        // Мы просим объект Scanner - верни нам то, что введут. и он переводит программу
        // в режим ожидания,
        // пока мы не введем значение и не нажмем ввод.
        String userName = scn.next();
        /*
         * // Если нам надо было ввести число и что бы не выдвло Exeption можно
         * проверить, а действительно ли было
         * // введено число.
         * if (scn.hasNextInt()){
         * String userName = scn.nextInt();
         * System.out.println("Вы ввели: "+ userName);
         * } else
         * System.out.println("Ну это определенно не число");
         * 
         * if (scn.hasNextInt()){ - если действительно число (true) - то Scanner
         * попросит его отдать
         * иначе перейдет к else и выведет, что введено не число.
         */
        System.out.println("Привет, " + userName + "!");
        scn.close();
        LocalDateTime date = LocalDateTime.now();
        int hour = date.getHour();
        System.out.println(hour);
        if (hour > 0 && hour <= 6) {
            System.out.println("Доброй ночи, " + userName);
        } else {
            if (hour > 6 && hour <= 12) {
                System.out.println("Доброе утро, " + userName);
            } else {
                if (hour > 12 && hour <= 18) {
                    System.out.println("Добрый день, " + userName);
                } else {
                    if (hour > 18 && hour <= 24)
                        System.out.println("Добрый вечер, " + userName);
                }

            }
        }

    }

}