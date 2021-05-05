package ru.julia;

import java.util.HashMap;
import java.util.Map;

/**
 * 119. В массиве найти число, повторяющееся максимальное количество раз. Если их несколько, то любое
 */
public class Algorithms119 {
    public static void main(String[] args) {
        Integer[] array = {0, 2, 5, 5, 5, 5, 0, 0, 0, 5};
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
        System.out.println(map);
        int max = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                System.out.println(key);
                break;
            }
        }
    }
}
