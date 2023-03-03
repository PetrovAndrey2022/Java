package Gb.Seminar.Seminar_1;

/* Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1 */
public class array {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
        int count = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println(i);
            if (array[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    count = 0;
                } else {
                    count = 0;

                }
            }
        }
        System.out.println("Максимальное количество подряд идущих 1 равно: " + ((count > max) ? count : max));

    }

}
