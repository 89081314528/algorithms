package ru.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 125. Является ли последовательность натуральных чисел перестановкой чисел от 1 до n?
 */
public class Algorithms125 {
    public static void main(String[] args) {
        Integer[] array = {7, 0, 5, 1, 2, 3, 4, 6};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Первоначальный лист = " + list);
        Collections.sort(list);
        System.out.println("Отсортированный лист = " + list);
        if (list.get(0) == 1) {
            for (int i = 0; i < list.size() - 1; i++) {
                int current = list.get(i);
                int next = list.get(i + 1);
                if (current + 1 == next) {
                    if (next == list.size() - 1) {
                        System.out.println("верно");
                    }
                } else {
                    System.out.println("неверно");
                    break;
                }
            }
        } else {
            System.out.println("неверно");
        }
    }
}
