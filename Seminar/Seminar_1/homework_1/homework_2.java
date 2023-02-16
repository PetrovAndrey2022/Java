//Задание2: Вывести все простые числа от 1 до 1000

/*Натуральное число, большее 1 , называется простым, если оно ни на что не делится, кроме себя и 1 .
Другими словами, n > 1 – простое, если при его делении на любое число кроме 1 и n есть остаток. */

public class homework_2 {
    public static void main(String[] args) {
        final int  NAMBER = 1000;
        int i, j;
        boolean isprime;
        System.out.println("Простые числа в диапазоне от 1 до 1000:");
              for(i=2; i < NAMBER; i++) {
                isprime = true;
                  // проверить, делится ли число без остатка
                  for (j=2; j <= i/j; j++)
                        // если число делится без остатка, значит, оно не простое
                           if((i%j) == 0) isprime = false;
                  if (isprime)
                          System.out.println(i);
     }
    }
}
