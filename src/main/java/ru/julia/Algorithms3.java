package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Определить, есть ли среди цифр заданного трехзначного числа одинаковые
 */
public class Algorithms3 {
    public static void main(String[] args) {
        int number = -3567890;
        List<Integer> listOfNumerals = numeralsOfNumber(number);// здесь нужно создавать новый лист?
        int count = 0;
        for (int i = 0; i < listOfNumerals.size(); i++) {
            int current = listOfNumerals.get(i);
            for (int j = i + 1; j < listOfNumerals.size(); j++) {
                if (current == listOfNumerals.get(j)) {
                    count = count + 1;
                    System.out.println("Есть одинаковые цифры");
                    break;// из какого цикла он выйдет? из внутреннего или изо всех?
                }
            }
        }
        if (count == 0) {
            System.out.println("Одинаковых цифр нет");
        }
    }
    public static List<Integer> numeralsOfNumber(int number) {
        List<Integer> numeralsOfNumbers = new ArrayList<>();
        number = Math.abs(number);
        if (number == 0) {
            numeralsOfNumbers.add(number);
        } else {
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                numeralsOfNumbers.add(remainder);
            }
        }
        return numeralsOfNumbers;
    }
}
