package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 114. Массив состоит из 0, 1 и 2. Отсортировать по возрастанию.
 */
public class Algorithms114 {
    public static void main(String[] args) {
        Integer[] array = {0, 0, 2, 1, 0, 0, 2, 1, 0, 1, 0, 1};
//        bubbleSort(array);
        sortWithMap(array);
    }
    public static void sortWithMap(Integer[] array) {
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
            for (int i = 0; i < map.get(key); i++) {
                list.add(key);
            }
        }
        System.out.println(list);
    }
    public static void bubbleSort(Integer[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int count = 0;
            for (int i = 0; i < array.length - 1 - j; i++) {
                int current = array[i];
                int next = array[i + 1];
                if (current > next) {
                    array[i + 1] = current;
                    array[i] = next;
                    count = count + 1;
                }
            }
            if(count == 0) {
                break;
            }
        }
        printMassive(array);
    }
    public static void printMassive(Integer[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
    }
}
