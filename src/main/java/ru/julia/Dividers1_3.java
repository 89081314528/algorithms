package ru.julia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1.3 Определение делителей числа
 */
public class Dividers1_3 {
    public static void main(String[] args) {
        int number = 3;
        deviders1(number);
        deviders2(number);
        number = 100;
        deviders1(number);
        deviders2(number);

    }

    public static void deviders1(int number) {
        List<Integer> dividersList = new ArrayList<>();
        dividersList.add(1);
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                dividersList.add(i);
            }
        }
        dividersList.add(number);
        System.out.println("Делители числа " + number + " " + dividersList);
    }

    public static void deviders2(int number) {
        List<Integer> dividersList = new ArrayList<>();
        dividersList.add(1);
        int sqrtIsInteger = 0;
        if (Math.sqrt(number) % 1 == 0) {
            sqrtIsInteger = 1;
        }
        for (int i = 2; i < Math.sqrt(number) + sqrtIsInteger; i++) {
            if (number % i == 0) {
                dividersList.add(i);
                if(number / i > i) {
                    dividersList.add(number / i);
                }
            }
        }
        dividersList.add(number);
        Collections.sort (dividersList);
        System.out.println("Делители числа " + number + " " + dividersList);
    }
}

