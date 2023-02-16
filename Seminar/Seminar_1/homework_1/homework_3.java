/*Задача 3:
Реализовать простой калькулятор
*/
import java.util.Scanner;

public class homework_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //считывает с консоли целое число и возвращать его
        int number1 = getInt();
        int number2 = getInt();
        //считывает с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
        char operation = getOperation();
        //выполняет над числами number1 и number2 арифметические операции
        int result = calc(number1,number2,operation);
        System.out.println("Результат операции: "+result);
        
    }
    //выполняет над числами number1 и number2 арифметические операции
    public static int calc(int number1, int number2, char operation){
        int result;
        switch (operation){
            case '+':
                result = number1+number2;
                break;
            case '-':
                result = number1-number2;
                break;
            case '*':
                result = number1*number2;
                break;
            case '/':
                result = number1/number2;
                break;
            default:
                System.out.println("Не корректна введена операция. Повторите ввод.");
                result = calc(number1, number2, getOperation());//рекурсия
        }    
        
        return result;
    }

    // считывает с консоли целое число и возвращать его.
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            //рекурсивный вызов
            num = getInt();
        }
        return num;
    }
     //считывает с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            //рекурсивный вызов
            operation = getOperation();
        }
        return operation;
    }
 
    
}