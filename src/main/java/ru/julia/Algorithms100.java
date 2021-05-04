package ru.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 100. Из массива удалить элементы, которые встречаются один раз.
 */
public class Algorithms100 {
    public static void main(String[] args) {
    Integer[] array = {0, 2, 5, 5, 5, 5, 0, 3, 0, 0};
    List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
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
