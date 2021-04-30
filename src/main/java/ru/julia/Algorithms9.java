package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 9. Найти в заданном интервале натуральных чисел такие, которые делятся на 30 и имеют 105
 * натуральных делителей, включая 1 и само число
 */
public class Algorithms9 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            if (isDevided(i) && hasDeviders(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isDevided(int number) {
        if (number % 30 == 0) {
            return true;
        }
        return false;
    }
    public static boolean hasDeviders(int number) {
        int numberOfDeviders = 0;
        for (int i = 1; i < number + 1; i++) {
            if(number % i == 0) {
                numberOfDeviders = numberOfDeviders + 1;
            }
        }
        if (numberOfDeviders == 105) {
            return true;
        }
        return false;
    }
}
