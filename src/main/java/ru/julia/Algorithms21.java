package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 21. Треугольник паскаля 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
public class Algorithms21 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);

        addLine(list, 7);


    }
//        int a = 5;
//        System.out.println("Сумма от одного до " + a + " равна " + sum(5));


    public static List<Integer> addLine(List<Integer> list, int n) {
        if (n == 0) {
            return list;
        }
        List<Integer> newList = new ArrayList();
        newList.add(1);
        for (int i = 0; i < list.size() - 1; i++) {
            newList.add(list.get(i) + list.get(i + 1));
        }
        newList.add(1);
        System.out.println(newList);
        list = newList;
        return addLine(list, n - 1);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

}
