package Seminar.Seminar_2.homework_2;
/*
Написать метод который приводит сторку к нормальному виду
строка на вход
Добрый день Как дела Все хорошо
выход
Добрый день. Как дела. Все хорошо. */


import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
      
        // Пользовательский ввод
        // Scanner scn = new Scanner (System.in);
        // System.out.println(" Введите предложение: ");
        // String userInput=scn.nextLine();
        // scn.close();

        String userInput = "Добрый день Как дела Все хорошо";

        System.out.println("Вы ввели: "+ userInput);
        // Разбиваем строку по заглавным буквам слова (бьем перед ней)
        String[] result = userInput.split("(?=[А-Я])");

        for (int i=0; i<result.length; i++){
            System.out.print((result[i].trim())+". "); 
        }
       

    }
}
