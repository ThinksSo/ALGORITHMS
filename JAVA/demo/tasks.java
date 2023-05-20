package JAVA.demo;

import java.util.ArrayList;
import java.util.List;

public class tasks {

    public static void main(String[] args) {
        int dividend = 12;
        System.out.printf("\n\u001B[1mДопустимые делители для числа %d \u001B[0m \n", dividend);
        List<Integer> availableDivider = availableDivider(dividend);
        for (Integer integer : availableDivider) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");

        int simple = 6;
        System.out.printf("\n\u001B[1mСписок простых чисел до числа %s \u001B[0m \n", simple);
        List<Integer> findsimpleNumbers = findsimpleNumbers(simple);
        for (Integer integer : findsimpleNumbers) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");
    }

    // Допустимые делители для числа

    public static List<Integer> availableDivider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            counter++;
            if (number % i == 0) {
                result.add(i);
            }
        }
        System.out.println("Counter (available Divider) = " + counter);
        return result;
    }

    // Простые числа

    public static List<Integer> findsimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;
                    //break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }

        System.out.println("Counter (find simple Numbers) = " + counter);
        return result;
    }
}
