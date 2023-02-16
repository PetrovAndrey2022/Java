//Написать программу, которая запросит пользователя ввести имя в консоль.
//Получить введенную строку и вывести в консоль сообщение "Привет, имя"
import java.util.Scanner;
import java.util.Date;
import java.time.LocalTime;


public class tesk1 {
               
        public static void main(String[] args) 
        {
                // Scanner iScaner=new Scanner(System.in);
                // System.out.println("Введите свое имя ");
                // String name = iScaner.nextLine();
                // System.out.printf("Привет, %s!", name);
                // iScaner.close();
                
                Scanner inputString=new Scanner(System.in);
                System.out.print("Введите ваше имя...");
                String inputName=inputString.nextLine();
                System.out.printf("Привет, %s!", inputName);
                inputString.close();
                System.out.println();
                
                int hour = LocalTime.now().getHour();
                if (hour>=5 && hour<12){
                System.out.println("Доброе утро!,"+inputName);
                }
                else if (hour>=12 && hour<18)
                {
                        System.out.println("Добрый день!,"+inputName);
                }
                else if (hour>=18 && hour<23)
                {
                        System.out.println("Доброй ночи!,"+inputName);
               }
        }
}
