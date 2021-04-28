package ru.julia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3.3.5 Быстрая сортировка
 */
public class FastSort3_3_5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers.add(number);
        }
        System.out.println(numbers);
while (!isSortedByMiddle(numbers)) {
    sortByMiddle(numbers);
    System.out.println(isSortedByMiddle(numbers));

}

    }
public static List<Integer> sortByMiddle(List<Integer> numbers) {
    int middle = numbers.get(numbers.size() / 2);
    System.out.println("middle " + middle);
    int maxIndex = 0;
    int max = numbers.get(0);
    for (int j = 0; j < numbers.size(); j++) {
        if (numbers.get(j) >= middle) {
            max = numbers.get(j);
            System.out.println(max);
            maxIndex = j;
            break;
        }
    }
    int min = numbers.get(0);
    int minIndex = 0;
    for (int j = numbers.size() - 1; j >= 0; j--) {
        if (numbers.get(j) <= middle) {
            min = numbers.get(j);
            System.out.println(min);
            minIndex = j;
            break;
        }
    }
    if (maxIndex < minIndex && numbers.get(maxIndex) >= middle && numbers.get(minIndex) <= middle) {
        numbers.set(maxIndex, min);
        numbers.set(minIndex, max);
    }
    System.out.println(numbers);
    while (maxIndex < minIndex) {
        for (int j = maxIndex + 1; j < numbers.size(); j++) {
            if (numbers.get(j) >= middle) {
                max = numbers.get(j);
                System.out.println(max);
                maxIndex = j;
                break;
            }
        }
        for (int j = minIndex - 1; j >= 0; j--) {
            if (numbers.get(j) <= middle) {
                min = numbers.get(j);
                System.out.println(min);
                minIndex = j;
                break;
            }
        }
        if (maxIndex < minIndex && numbers.get(maxIndex) >= middle && numbers.get(minIndex) <= middle) {
            numbers.set(maxIndex, min);
            numbers.set(minIndex, max);
        }
        System.out.println(numbers);
    }
    return numbers;
}
    public static boolean isSortedByMiddle(List<Integer> numbers) { // проверить этот метод
        int count = 0;
        int middle = numbers.get(numbers.size()/2);
        for (int i = 0; i < numbers.size()/2 + 1; i++) {
            if (numbers.get(i) > middle) {
                count = count + 1;
            }
        }
        for (int i = numbers.size()/2; i < numbers.size(); i++) {
            if (numbers.get(i) < middle) {
                count = count + 1;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}

