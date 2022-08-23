package hw2.task1;

import java.util.Scanner;
import java.util.TreeMap;

public class Numbers {

    public static String Enter() {
        System.out.println("Type a number:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String CheckRange(float a){
        boolean state = (a <= 5 && a >= -5);
        String result;
        if (state) {
            result = a + " is in range [-5,5].";
        } else {
            result = a + " is not in range [-5,5].";
        }
        return result;
    }

    public static String CheckMaxMin(int a, int b, int c){
        int max = a;
        int min = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return "Max is " + max + ". Min is " + min + ".";
    }

    public static boolean Subtask1(){
        float x = Float.parseFloat(Numbers.Enter());
        float y = Float.parseFloat(Numbers.Enter());
        float z = Float.parseFloat(Numbers.Enter());

        System.out.println(Numbers.CheckRange(x));
        System.out.println(Numbers.CheckRange(y));
        System.out.println(Numbers.CheckRange(z));
        return true;
    }

    public static boolean Subtask2(){
        int x = Integer.parseInt(Numbers.Enter());
        int y = Integer.parseInt(Numbers.Enter());
        int z = Integer.parseInt(Numbers.Enter());
        System.out.println(Numbers.CheckMaxMin(x, y, z));
        return true;
    }

    public static void main(String...args){
        Numbers.Subtask1();
        Numbers.Subtask2();
    }
}
