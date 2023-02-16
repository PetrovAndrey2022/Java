import java.util.Scanner;
/**
 Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class homework_1 {
    public static void main(String[] args) {
        Scanner numberN=new Scanner(System.in);
        System.out.print("Введите число n - ");
        String input=numberN.nextLine();
        numberN.close();
        // Вычисляем треугольное число.
        int inputNumber=Integer.parseInt(input);
        float sum=(inputNumber/2)*(inputNumber+1);
        int sumInt = (int)Math.round(sum);
        System.out.printf("Cумма чисел от 1 до %s!",input+" = "+sumInt);
        System.out.println();
       
        // Вычисляем факториал числа.
        int factorial=1;
        for (int i=1; i<=inputNumber; i++){
            factorial*=i;
        }
        System.out.printf("Факториал от 1 до %s!",input+" = "+factorial);
    }
    
}














