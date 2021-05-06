package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.3.5 Быстрая сортировка,части могут быть неравными.
 * не доделала
 */
public class FastSort3_3_5_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers.add(number);
        }
            System.out.println(numbers);
        System.out.println(sortByPoint(numbers));
    }
    public static List<Integer> sortByPoint(List<Integer> numbers) { // сортирует один раз
        int endOfFirstPart = 0;
        int point = numbers.get(0);
        int maxIndex = 0;
        int max = numbers.get(0);
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) > point) {
                max = numbers.get(j);
                maxIndex = j;
                break;
            }
        }
        int min = numbers.get(numbers.size() - 1);
        int minIndex = numbers.size() - 1;
        for (int j = numbers.size() - 1; j >= 0; j--) {
            if (numbers.get(j) <= point) {
                min = numbers.get(j);
                minIndex = j;
                break;
            }
        }

        if (maxIndex < minIndex && max > point && min <= point) {
            numbers.set(maxIndex, min);
            numbers.set(minIndex, max);
            System.out.println("max = " + max);
            System.out.println("min = " + min);
            System.out.println(numbers);
            endOfFirstPart = maxIndex;
        }

        while (maxIndex < minIndex) {
            for (int j = maxIndex + 1; j < numbers.size(); j++) {
                if (numbers.get(j) > point) {
                    max = numbers.get(j);
                    maxIndex = j;
                    break;
                }
            }
            for (int j = minIndex - 1; j >= 0; j--) {
                if (numbers.get(j) <= point) {
                    min = numbers.get(j);
                    minIndex = j;
                    break;
                }
            }
            if (maxIndex < minIndex && max > point && min <= point) {
                numbers.set(maxIndex, min);
                numbers.set(minIndex, max);
                System.out.println("max = " + max);
                System.out.println("min = " + min);
                System.out.println(numbers);
                endOfFirstPart = maxIndex;
            }
        }
        System.out.println("endOfFirstPart = " + endOfFirstPart);
        return numbers;
    }
}
