package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Счастливые билеты, у которых сумма правых трех цифр равна сумме левых.
 * Посчитать количество билетов от 0 до 999 999, если меньше шести цифр, заменить нолями.
 */
public class Algorithms22 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if(isHappyNumber(i)) {
                System.out.println(i);
                count = count + 1;
            }
        }
        System.out.println(count);
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
        while (numeralsOfNumbers.size() < 6) {
            numeralsOfNumbers.add(0);
        }
        return numeralsOfNumbers;
    }
    public static boolean isHappyNumber(int number){
        List<Integer> list = numeralsOfNumber(number);
        return list.get(0) + list.get(1) + list.get(2) == list.get(3) + list.get(4) + list.get(5);
    }
}
