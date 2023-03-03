/*
1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class tesk__1 {
    public static void main(String[] args) {
        // Пользовательский ввод
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите количество элементов в списке: ");
        int counter=scn.nextInt();
        //scn.close();

        // Заполнение списка.
        int count;
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i=0; i<counter; i++){
            System.out.print("Введите значение ");
            count=scn.nextInt();
            myList.add(count);
        }
        // вывод введеного списка на экран.
        System.out.println("Введенный исходный список: "+myList);

        // поиск max, min, sum элемента списка.
        System.out.println();
        System.out.println("_____ РЕШЕНИЕ ПЕРВЫМ СПОСОБОМ_______");
        int max =myList.get(0); // Задаем начальные значения - первый элемент
        int min=myList.get(0); // Задаем начальные значения -  первый элемент
        int sum=0; // Задаем начальные значения
        for (int item : myList){
            if (item>max)
                max=item;
            if (item<min)
                min=item;
            sum+=item;
        }
        System.out.println("Максимальное значение в списке равно "+max );
        System.out.println("Минимальное значение в списке равно "+min );
        System.out.println("Среднее арифметическое значение в списке равно "+sum/ myList.size() );

        // 2 способ
        // Сортируем массив и крайние значения присваиваем min и max
        System.out.println();
        System.out.println("_____ РЕШЕНИЕ ВТОРЫМ СПОСОБОМ_______");
        myList.sort(Integer::compareTo);
        System.out.println("Отсортированный список "+ myList);
        int max2=myList.get(myList.size()-1);
        int min2=myList.get(0);
        int sum2=0;
        for (int item : myList)
            sum2+=item;
        System.out.println("Максимальное значение в списке равно - последнему элементу отсортированного списка "+max2 );
        System.out.println("Минимальное значение в списке равно - первому элементу отсортированного списка "+min2 );
        System.out.println("Среднее арифметическое значение в списке равно "+sum2/ myList.size() );

    }
}
