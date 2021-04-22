package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.4.1. Нахождение простых числел методом решето Эратосфена
 */
public class PrimeNumbers1_4_1 {
    public static void main(String[] args) {
        int number = 100;
        primeNumbers(number);
    }
        public static void primeNumbers(int number) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < number + 1; i++) {
            listOfNumbers.add(i);
        }
//        System.out.println(listOfNumbers);
        for (int j = 2; j < listOfNumbers.size()/2 ; j++) {
            if (listOfNumbers.get(j) == 0) {
            } else {
                int start = j;
//                System.out.println(start);
                for (int i = start + 1; i < listOfNumbers.size(); i++) {
                    if (i % start == 0) {
                        listOfNumbers.set(i, 0);
                    }
                }
//                System.out.println(listOfNumbers);
            }
        }
        List<Integer> newListOfNumbers = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) != 0) {
                newListOfNumbers.add(listOfNumbers.get(i));
            }
        }
        System.out.println(newListOfNumbers);
    }
}
