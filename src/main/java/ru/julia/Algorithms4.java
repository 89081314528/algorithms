package ru.julia;

/**
 * 4. Найти все трехзначные числа, цифры которых составляют арифметическую прогрессию, первая цифра делится на 3,
 * а все число делится на 5
 */
public class Algorithms4 {
    public static void main(String[] args) {
        int number = 655;
        for (int i = 100; i < 1000; i++) {
            if (isDevide(i) && isProgression(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isDevide (int number) {
        return ((number / 100) % 3 == 0 && number % 5 == 0);
        }
    public static boolean isProgression (int number) {
        int numeral1 = number/100;
        int numeral2 = (number % 100) / 10;
        int numeral3 = number % 10;
        return (numeral2 - numeral1) == (numeral3 - numeral2);
    }
}
