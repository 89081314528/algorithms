package ru.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 111. В массиве найти длину самой длиной последовательности из нолей.
 */
public class Algorithms111 {
    public static void main(String[] args) {
        Integer[] array = {0, 0, 5, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        int maxCount = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            int current = list.get(i);
            if (current == 0) {
                count = count + 1;
                for (int j = i + 1; j < list.size(); j++) {
                    int next = list.get(j);
                    if (next == 0) {
                        count = count + 1;
                    } else {
                        System.out.println("count = " + count);
                        i = j;
                        break;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
