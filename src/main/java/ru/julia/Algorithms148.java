package ru.julia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 148. В отсортированную последовательность вставить число, воспользовавшись бинарным поиском.
 */
public class Algorithms148 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(2, 10, 20, 30, 40, 50, 60, 70));
        System.out.println(numbers);
        System.out.println(binaryInsert(numbers,71,0,0));
    }

    public static List<Integer> binaryInsert(List<Integer> numbers, int number, int start, int finish) {
        List<Integer> newList = new ArrayList<>();
        start = 0;
        finish = numbers.size() - 1;
        if (numbers.get(finish) < number) {
            numbers.add(number);
            return numbers;
        }
        int middle = (finish - start) / 2;
        while (middle != start && middle != finish) {
            if (numbers.get(middle) > number) {
                finish = middle;
                middle = (finish - start) / 2;
            } else if (numbers.get(middle) <= number) {
                start = middle;
                middle = start + (finish - start) / 2;
            }
        }
        System.out.println("start = " + start);
        System.out.println("finish = " + finish);
        System.out.println("middle = " + middle);
        if (numbers.get(start) > number) {
            for (int i = 0; i < start; i++) {
                newList.add(numbers.get(i));
            }
            newList.add(number);
            for (int i = start; i < numbers.size(); i++) {
                newList.add(numbers.get(i));
            }
        } else {
            for (int i = 0; i < finish; i++) {
                newList.add(numbers.get(i));
            }
            newList.add(number);
            for (int i = finish; i < numbers.size(); i++) {
                newList.add(numbers.get(i));
            }
        }
        return newList;
    }
}
