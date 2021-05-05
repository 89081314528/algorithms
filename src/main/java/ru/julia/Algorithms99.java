package ru.julia;

import java.util.*;

/**
 * 99. Из массива удалить повторяющиеся элементы, массив сжать.
 */
public class Algorithms99 {
    public static void main(String[] args) {
        Integer[] array = {0, 2, 5, 5, 5, 5, 0, 0, 0, 0};
        withList(array);
        withMap(array);
    }

    public static void withMap(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(key);
        }
        System.out.println(list);
    }

    public static void printMassive(Integer[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
    }

    public static void withList(Integer[] array) {
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
        Integer[] newArray = list.toArray(new Integer[list.size()]);
        printMassive(newArray);
    }
}
