package Lecture.Lecture_2;

public class String_1 {
    public static void main(String[] args) {
    // // создадим строку из миллиона плючиков
    // String str ="";
    // for (int i = 0; i<1_000_000; i++)
    // {
    //     str += "+";
    // }
    // System.out.println(str);

    StringBuilder sb=new StringBuilder();
    for (int i=0; i<1_000_000; i++){
        sb.append("+");
    }
    System.out.println(sb);
    }
    

}
