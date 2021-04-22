package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.4.2. Нахождение простых числел методом поиска делителей числа
 */
public class PrimeNumbers1_4_2 {
    public static void main(String[] args) {
        int number = 100;
        primeNumbers(number);
    }

    public static void primeNumbers(int number) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 3; i < number + 1; i = i + 2) {
            listOfNumbers.add(i);
        }
        System.out.println(listOfNumbers);

        List<Integer> newListOfNumbers = new ArrayList<>();
        newListOfNumbers.add(2);
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (numberIsPrime(listOfNumbers.get(i))) {
                newListOfNumbers.add(listOfNumbers.get(i));
            }
        }
        System.out.println(newListOfNumbers);

    }

    public static boolean numberIsPrime(int number) {
        List<Integer> dividersList = new ArrayList<>();
        for (int i = 3; i < number / 2 + 1; i++) { //если число 3 или 5, не заходит в цикл
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
