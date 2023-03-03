public class passing_arguments {
    public static void main(String[] args) {
        if (args[0].equals("-en")) {
            System.out.println("Опция для английского языка");
        } else {
            if (args[0].equals("-es")) {
                System.out.println("Опция для испанского языка");
            } else {
                System.out.println("Неизвестная опция");
            }

        }

    }
}
// не запустил ее