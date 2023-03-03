
import java.io.IOException;
import java.time.LocalDateTime;

public class localDateTime {
    public static void main(String[] args) throws IOException {
        // // Создадим объект который будет содержать текущие дату и время.
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);// 2023-02-20T00:21:58.153740100
        System.out.println("\nСейчас " + date); // пустая строка empty string
        // // Сейчас 2023-02-20T00:24:31.891946100

        // // // увеличим значение года и выведим измененное значение
        // // date = date.withYear(2024);
        // // System.out.println("\nТеперь текущее время " + date); // empty string
        // // // Теперь текущее время 2024-02-20T00:30:57.501596200

        // // выведим отдельные поля объекта LocalDateTime
        String fields = "\nГод:\t\t\t" + date.getYear(); // получить год
        // fields += "\nМесяц:\t\t\t" + date.getMonth(); // получить месяц
        // // fields += "\nНомер месяца:\t\t\t" + date.getMonthValue(); // получить
        // // месячное значение
        // fields += "\nДень недели:\t\t\t" + date.getDayOfWeek(); // получить день
        // // недели
        // fields += "\nДень месяца:\t\t\t" + date.getDayOfMonth(); // получить день
        // // месяца
        // fields += "\nДень в году:\t\t\t" + date.getDayOfYear(); // получиь день в
        // // году
        // fields += "\nЧас (0-23):\t\t\t" + date.getHour();// получить час
        // fields += "\nМинута:\t\t\t" + date.getMinute(); // получить минуты часа
        // fields += "\nСекунды:\t\t\t" + date.getSecond(); // получить секунды
        System.out.println(fields);

    }

}
