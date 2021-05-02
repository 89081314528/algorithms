package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 14. Натуральное число сверхпростое, если при любой перестановке его цифр получается простое число
 */
public class Algorithms14 {
    public static void main(String[] args) {
        for (int i = 111; i < 999 ; i++) {
            List<Integer> reverseList = reverseNumber(i);
            int count = 0;
            for (int j = 0; j < reverseList.size(); j++) {
                if (numberIsPrime(reverseList.get(j))) {
                    count = count + 1;
                } else {
                }
            }
            if (count == 6) {
                System.out.println(i + " " + reverseList);
            }
        }
    }

    public static List<Integer> reverseNumber(int number) {
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
        int numeral1 = numeralsOfNumbers.get(0);
        int numeral2 = numeralsOfNumbers.get(1);
        int numeral3 = numeralsOfNumbers.get(2);
        List<Integer> reverseNumbers = new ArrayList<>();
        reverseNumbers.add(numeral1*100 + numeral2*10 + numeral3);
        reverseNumbers.add(numeral1*100 + numeral3*10 + numeral2);
        reverseNumbers.add(numeral2*100 + numeral1*10 + numeral3);
        reverseNumbers.add(numeral2*100 + numeral3*10 + numeral1);
        reverseNumbers.add(numeral3*100 + numeral1*10 + numeral2);
        reverseNumbers.add(numeral3*100 + numeral2*10 + numeral1);
        return reverseNumbers;
    }

    public static boolean numberIsPrime(int number) {
        List<Integer> dividersList = new ArrayList<>();
        for (int i = 2; i < number / 2 + 1; i++) { //если число 3 или 5, не заходит в цикл
            if (number % i == 0) {
                dividersList.add(i);
            }
        }
        if (dividersList.size() > 0) {
            return false;
        }
        return true;
    }
}
