package ru.julia;

import java.util.*;

/**
 * 100. Из массива удалить элементы, которые встречаются один раз.
 */
public class Algorithms100 {
    public static void main(String[] args) {
        Integer[] array = {0, 2, 5, 5, 5, 5, 0, 3, 0, 0};
        printMassive(array);
//        withList(array);
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
        for (int i = 0; i < array.length; i++) {
            Integer current = array[i];
            if (map.get(current) != 1) {
                list.add(current);
            }
        }
        System.out.println(list);
    }

    public static void withList(Integer[] array) {
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (current == list.get(j)) {
                    count = count + 1;
                }
            }
            if (count == 1) {
                list.remove(i);
                i = i - 1;
            }
        }
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
