package hw1.task1;

import java.util.Scanner;

public class Calculator {
    public static int Enter() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int Sum(Integer a, Integer b) {
        return a + b;
    }

    public static int Difference(Integer a, Integer b) {
        return a - b;
    }

    public static int Multiplication(Integer a, Integer b) {
        return a * b;
    }

    public static float Division(Integer a, Integer b) {
        return a.floatValue() / b.floatValue();
    }

    public static void main(String... args) {

        System.out.println("Please enter a value for 'a'");
        int a = Calculator.Enter();
        System.out.println("Please enter a value for 'b'");
        int b = Calculator.Enter();

        System.out.println("Sum of " + a + " and " + b + " is: " + Calculator.Sum(a, b));
        System.out.println("Difference between 3" + a + " and " + b + " is: " + Calculator.Difference(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + Calculator.Multiplication(a, b));
        System.out.println("Division of " + a + " and " + b + " is: " + Calculator.Division(a, b));

    }
}
