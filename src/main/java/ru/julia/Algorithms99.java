package ru.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 99. Из массива удалить повторяющиеся элементы, массив сжать.
 * сделала с помощью листа. Можно сделать без листа?
 */
public class Algorithms99 {
    public static void main(String[] args) {
        Integer[] array = {0, 2, 5, 5, 5, 5, 0, 0, 0, 0};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (current == list.get(j)) {
                    list.remove(list.get(j));
                    j = j - 1;
                }
            }
        }
        System.out.println(list);
        Integer[] newArray = list.toArray(new Integer[list.size()]);
        printMassive(newArray);
    }
    public static void printMassive(Integer[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
    }
}
