/*
2 Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

import java.util.ArrayList;
import java.util.Scanner;

public class tesk_2 {
    public static void main(String[] args) {
        // Ввод количества элементов списка
        Scanner scn=new Scanner(System.in);
        System.out.print("Введите количество элементов в списке: ");
        int counter=scn.nextInt();

        // Заполненние списка
        ArrayList<Integer> myList = new ArrayList<>();
        int count=0;
        for (int i=0;i<counter;i++){
            System.out.print("Введите элемент списка: ");
            count= scn.nextInt();
            myList.add(count);
        }
        System.out.println("Введенный исходный список "+ myList);

        ArrayList<Integer> myList2 = new ArrayList<>();// Создаем новый список
        for (int item : myList){
            if (item%2!=0) { // Если элемент нечетный
                myList2.add(item); // добавляем его в список
            }
        }
        System.out.println("Список нечетных чисел "+ myList2);


    }
}
