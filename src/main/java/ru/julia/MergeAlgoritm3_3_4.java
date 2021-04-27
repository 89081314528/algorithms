package ru.julia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3.3.4 Алгоритм слияния - объединить два упорядоченных по возрастанию массива
 */
public class MergeAlgoritm3_3_4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers.add(number);
        }
        Collections.sort(numbers);
        System.out.println(numbers);
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers2.add(number);
        }
        Collections.sort(numbers2);
        System.out.println(numbers2);
        merge(numbers,numbers2);
    }

    public static void merge(List<Integer> numbers, List<Integer> numbers2) {
        List<Integer> merge = new ArrayList<>();
        while(numbers.size() > 0 && numbers2.size() > 0 ) {
            if(numbers.get(0) < numbers2.get(0)) {
                merge.add(numbers.get(0));
                numbers.remove(0);
            } else {
                merge.add(numbers2.get(0));
                numbers2.remove(0);
            }
        }
        System.out.println("1 " + numbers);
        System.out.println("2 " + numbers2);
        System.out.println("merge " + merge);

        if(numbers.size() > 0) {
            for (int i = 0; i < numbers.size(); i++) {
                merge.add(numbers.get(i));
            }
        } else {
            for (int i = 0; i < numbers2.size(); i++) {
                merge.add(numbers2.get(i));
            }
        }
        System.out.println("merge " + merge);
    }
}
