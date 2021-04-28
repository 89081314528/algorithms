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

        List<List<Integer>> listListov = share(numbers);
        System.out.println(listListov);
        int partSize = listListov.get(0).size();
        while (partSize > 3) {
            int size = listListov.size();
            for (int i = 0; i < size; i++) {
                List<List<Integer>> listListov1 = share(listListov.get(i));
                for (int j = 0; j < listListov1.size(); j++) {
                    listListov.add(listListov1.get(j));
                }
            }
            for (int i = 0; i < size; i++) {
                listListov.remove(0);
            }
            System.out.println(listListov);
            partSize = listListov.get(0).size();
        }
    }

    public static List<List<Integer>> share(List<Integer> numbers) {
        while (!isSortedByMiddle(numbers)) {
            sortByMiddle(numbers);
        }
//    System.out.println("numbers = " + numbers);
        List<List<Integer>> listListov = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            list1.add(numbers.get(i));
        }
//    while (!isSortedByMiddle(list1)) {
//        sortByMiddle(list1);
//    }
        for (int i = numbers.size() / 2; i < numbers.size(); i++) {
            list2.add(numbers.get(i));
        }
//    while (!isSortedByMiddle(list2)) {
//        sortByMiddle(list2);
//    }
//    System.out.println(list2);
        listListov.add(list1);
        listListov.add(list2);
        return listListov;
    }

    public static List<Integer> sortByMiddle(List<Integer> numbers) {
        int middle = numbers.get(numbers.size() / 2 - 1);
        int middleIndex = numbers.size() / 2 - 1;
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
        int min = numbers.get(numbers.size() - 1);
        int minIndex = numbers.size() - 1;
        for (int j = numbers.size() - 1; j >= 0; j--) {
            if (numbers.get(j) <= middle) {
                min = numbers.get(j);
                minIndex = j;
                break;
            }
        }
        System.out.println("min = " + min);
        System.out.println(minIndex);
        System.out.println("max = " + max);
        System.out.println(maxIndex);
        if (maxIndex < minIndex && max >= middle && min <= middle) {
            numbers.set(maxIndex, min);
            numbers.set(minIndex, max);
            System.out.println("variant 1");
        }


    System.out.println(numbers);
        while (maxIndex < minIndex) {
            System.out.println("in");
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
                numbers.set(maxIndex, min);
                numbers.set(minIndex, max);
                System.out.println("variant2");
            }

        }

        return numbers;
    }

    public static boolean isSortedByMiddle(List<Integer> numbers) {
        int count = 0;
        int middle = numbers.get(numbers.size() / 2 - 1);
        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) > middle) {
                count = count + 1;
            }
        }
        for (int i = numbers.size() / 2; i < numbers.size(); i++) {
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

