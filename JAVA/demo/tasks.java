package JAVA.demo;

import java.util.ArrayList;
import java.util.List;

public class tasks {

    public static void main(String[] args) {
        int dividend = 12;
        System.out.printf("\n\u001B[1mДопустимые делители для числа %d \n", dividend);
        List<Integer> availableDivider = availableDivider(dividend);
        for (Integer integer : availableDivider) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");
    }


    // Допустимые делители для числа

    public static List<Integer> availableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }


    

}
