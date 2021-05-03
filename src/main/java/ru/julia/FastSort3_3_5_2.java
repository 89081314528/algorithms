package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.3.5 Быстрая сортировка,части могут быть неравными.
 */
public class FastSort3_3_5_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers.add(number);
        }
            System.out.println(numbers);
        sortByMiddle(numbers);
    }
    public static List<Integer> sortByMiddle(List<Integer> numbers) { // сортирует один раз
        int middle = numbers.get(numbers.size() / 2 - 1);
        int middleIndex = numbers.size() / 2 - 1;
        int maxIndex = 0;
        int max = numbers.get(0);
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) >= middle) {
                max = numbers.get(j);
                maxIndex = j;
                break;
            }
        }
        int min = numbers.get(numbers.size() - 1);
        int minIndex = numbers.size() - 1;
        for (int j = numbers.size() - 1; j >= 0; j--) {
            if (numbers.get(j) <= middle) {
                min = numbers.get(j);
                minIndex = j;
                break;
            }
        }

        if (maxIndex < minIndex && max >= middle && min <= middle) {
            if (min == max && maxIndex == middleIndex) {
                for (int j = minIndex - 1; j >= 0; j--) {
                    if (numbers.get(j) < middle) {
                        min = numbers.get(j);
                        minIndex = j;
                        break;
                    }
                }
            }
            if (min == max && minIndex == middleIndex) {
                for (int j = maxIndex + 1; j < numbers.size(); j++) {
                    if (numbers.get(j) > middle) {
                        max = numbers.get(j);
                        maxIndex = j;
                        break;
                    }
                }
            }
            numbers.set(maxIndex, min);
            numbers.set(minIndex, max);
            System.out.println(numbers);
        }

        while (maxIndex < minIndex) {
            for (int j = maxIndex + 1; j < numbers.size(); j++) {
                if (numbers.get(j) >= middle) {
                    max = numbers.get(j);
                    maxIndex = j;
                    break;
                }
            }
            for (int j = minIndex - 1; j >= 0; j--) {
                if (numbers.get(j) <= middle) {
                    min = numbers.get(j);
                    minIndex = j;
                    break;
                }
            }
            if (maxIndex < minIndex && max >= middle && min <= middle) {
                if (min == max && maxIndex == middleIndex) {
                    for (int j = minIndex - 1; j >= 0; j--) {
                        if (numbers.get(j) < middle) {
                            min = numbers.get(j);
                            minIndex = j;
                            break;
                        }
                    }
                }
                if (min == max && minIndex == middleIndex) {
                    for (int j = maxIndex + 1; j < numbers.size(); j++) {
                        if (numbers.get(j) > middle) {
                            max = numbers.get(j);
                            maxIndex = j;
                            break;
                        }
                    }
                }
                numbers.set(maxIndex, min);
                numbers.set(minIndex, max);
                System.out.println(numbers);
            }
        }
        return numbers;
    }

}
