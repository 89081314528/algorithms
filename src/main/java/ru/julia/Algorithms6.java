package ru.julia;

/**
 * 6. Найти четырехзначное число, сумма цифр которого равна разности между 2011 и самим числом
 */
public class Algorithms6 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (sumOfNumerals(i) == (2011 - i)) {
                System.out.println(i);
            }
        }
    }
    public static int sumOfNumerals(int number) {
        int sum = 0;
        if (number == 0) {
        } else {
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                sum = sum + remainder;
            }
        }
        return sum;
    }
}
