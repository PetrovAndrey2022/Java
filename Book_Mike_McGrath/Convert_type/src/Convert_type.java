public class Convert_type {
    public static void main(String[] args) {
        float daysFloat = 365.34f;
        String weekString = "52";
        String weekString1 = "52.16f";

        // Пробразовываем пременную с плавающей точкой в целочисленную
        int daysInt = (int) daysFloat;
        // Пробразовываем строковую переменную в целочисленную
        int weekInt = Integer.parseInt(weekString);
        // Пробразовываем строковую переменную float в целочисленную
        float weekString2 = Float.parseFloat(weekString1);
        int weekString3 = (int) Float.parseFloat(weekString1);

        int week = (daysInt / weekInt);
        System.out.println(daysInt);
        System.out.println(weekInt);
        System.out.println(weekString2);
        System.out.println(weekString3);
        System.out.println("Дней в неделе: - " + week);

    }
}
