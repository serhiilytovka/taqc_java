package hw1.task2;

import java.util.Scanner;

public class PhoneCalculator {
    public static String Enter() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static float CalculateRate(int duration, float price) {
        return duration * price;
    }

    public static Float PricePerCountry(String country) {
        System.out.println("Type price for " + country + " :");
        float price = Float.parseFloat(PhoneCalculator.Enter());

        System.out.println("How long talk was (in minutes):");
        int time = Integer.parseInt(PhoneCalculator.Enter());

        return PhoneCalculator.CalculateRate(time, price);
    }

    public static void main(String... args) {
        System.out.println("Type price");
        float result1 = PhoneCalculator.PricePerCountry("Poland");
        float result2 = PhoneCalculator.PricePerCountry("USA");
        float result3 = PhoneCalculator.PricePerCountry("France");

        System.out.println("Call from Poland costed: " + result1);
        System.out.println("Call from USA costed: " + result2);
        System.out.println("Call from France costed: " + result3);
        float sumCost = result1 + result2 + result3;
        System.out.println("Total cost is " + sumCost);
    }
}
