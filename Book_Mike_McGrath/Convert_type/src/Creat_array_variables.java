
public class Creat_array_variables {
    public static void main(String[] args) {
        // Объявляем и инициализируем строковый массив из трех элементов
        String[] str = { "Java", "Хороший", "Язык" };
        // Объявляем пустой целочисленный массив с тремя элементами
        int[] num = new int[3];
        // Присваиваем значения первым двум элементам массива num
        num[0] = 100;
        num[1] = 200;
        // Присваиваем новое значение 2 элементу массива str
        str[1] = "Лучший";
        // Выведим длину каждого массива в содержимое его элементов
        System.out.println("Длина массива str = " + str.length);
        System.out.println("Длина массива num = " + num.length);
        System.out.println("Содержимое массива str = " + str[0] + ", " + str[1] + ", " + str[2]);
        System.out.println("Содержимое массива num = " + num[0] + ", " + num[1] + ", " + num[2]);
    }

}