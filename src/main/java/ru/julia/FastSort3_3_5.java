package ru.julia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3.3.5 Быстрая сортировка (делит пополам). Написать, чтобы части могли быть неравными.
 */
public class FastSort3_3_5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < 50; j++) {
                int number = (int) (Math.random() * 100 - 0);
                numbers.add(number);
            }
//            System.out.println(numbers);
//            System.out.println(sort(numbers));
//            System.out.println(isSorted(sort(numbers)));
            if(isSorted(sort(numbers))) {
                count = count + 1;
            }
        }
        System.out.println("count = " + count);
    }

    public static List<Integer> sort(List<Integer> numbers) {
        List<List<Integer>> listListov = share(numbers);
        int partSize = listListov.get(0).size();
        while (partSize >= 2) {
            int size = listListov.size();
            for (int i = 0; i < size; i++) {
                List<List<Integer>> listListov1 = share(listListov.get(i));
                for (int j = 0; j < listListov1.size(); j++) {
                    listListov.add(listListov1.get(j));
                }
            }
            for (int i = 0; i < size; i++) {
                listListov.remove(0);
            }
//            System.out.println(listListov);
            partSize = listListov.get(0).size();
        }
        if (listListov.get(listListov.size() - 1).size() == 2){
            int first = listListov.get(listListov.size() - 1).get(0);
            int second = listListov.get(listListov.size() - 1).get(1);
            if (first > second) {
                listListov.get(listListov.size() - 1).set(0,second);
                listListov.get(listListov.size() - 1).set(1,first);

            }
        }

        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < listListov.size(); i++) {
            for (int j = 0; j < listListov.get(i).size(); j++) {
                sortedList.add(listListov.get(i).get(j));
            }
        }
        return sortedList;
    }

    public static List<List<Integer>> share(List<Integer> numbers) { // сортирует, пока все элементы слева от середины не
        // будут меньше, а справа больше середины
        while (!isSortedByMiddle(numbers)) {
            sortByMiddle(numbers);
        }
        List<List<Integer>> listListov = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            list1.add(numbers.get(i));
        }
        for (int i = numbers.size() / 2; i < numbers.size(); i++) {
            list2.add(numbers.get(i));
        }
        listListov.add(list1);
        listListov.add(list2);
        return listListov;
    }

    public static List<Integer> sortByMiddle(List<Integer> numbers) { // сортирует один раз
        int middle = numbers.get(numbers.size() / 2 - 1);
        int middleIndex = numbers.size() / 2 - 1;
        int maxIndex = 0;
        int max = numbers.get(0);
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) >= middle) {
                max = numbers.get(j);
                maxIndex = j;
                break;
            }
        }
        int min = numbers.get(numbers.size() - 1);
        int minIndex = numbers.size() - 1;
        for (int j = numbers.size() - 1; j >= 0; j--) {
            if (numbers.get(j) <= middle) {
                min = numbers.get(j);
                minIndex = j;
                break;
            }
        }

        if (maxIndex < minIndex && max >= middle && min <= middle) {
            if (min == max && maxIndex == middleIndex) {
                for (int j = minIndex - 1; j >= 0; j--) {
                    if (numbers.get(j) < middle) {
                        min = numbers.get(j);
                        minIndex = j;
                        break;
                    }
                }
            }
            if (min == max && minIndex == middleIndex) {
                for (int j = maxIndex + 1; j < numbers.size(); j++) {
                    if (numbers.get(j) > middle) {
                        max = numbers.get(j);
                        maxIndex = j;
                        break;
                    }
                }
            }
            numbers.set(maxIndex, min);
            numbers.set(minIndex, max);
//            System.out.println("variant 1");
        }
//        System.out.println(numbers);

        while (maxIndex < minIndex) {
//            System.out.println("in");
            for (int j = maxIndex + 1; j < numbers.size(); j++) {
                if (numbers.get(j) >= middle) {
                    max = numbers.get(j);
                    maxIndex = j;
                    break;
                }
            }
            for (int j = minIndex - 1; j >= 0; j--) {
                if (numbers.get(j) <= middle) {
                    min = numbers.get(j);
                    minIndex = j;
                    break;
                }
            }
            if (maxIndex < minIndex && max >= middle && min <= middle) {
                if (min == max && maxIndex == middleIndex) {
                    for (int j = minIndex - 1; j >= 0; j--) {
                        if (numbers.get(j) < middle) {
                            min = numbers.get(j);
                            minIndex = j;
                            break;
                        }
                    }
                }
                if (min == max && minIndex == middleIndex) {
                    for (int j = maxIndex + 1; j < numbers.size(); j++) {
                        if (numbers.get(j) > middle) {
                            max = numbers.get(j);
                            maxIndex = j;
                            break;
                        }
                    }
                }
                numbers.set(maxIndex, min);
                numbers.set(minIndex, max);
//                System.out.println("variant2");
            }
        }
        return numbers;
    }

    public static boolean isSortedByMiddle(List<Integer> numbers) {
        int count = 0;
        int middle = numbers.get(numbers.size() / 2 - 1);
        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) > middle) {
                count = count + 1;
            }
        }
        for (int i = numbers.size() / 2; i < numbers.size(); i++) {
            if (numbers.get(i) < middle) {
                count = count + 1;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSorted(List<Integer> numbers) {
//        System.out.println("проверяем лист " + numbers);
        for (int i = 0; i < numbers.size() - 1; i++) {
            int current = numbers.get(i);
            int next = numbers.get(i + 1);
            if (current > next) {
                System.out.println("current = " + current);
                System.out.println("next = " + next);
                return false;
            }
        }
        return true;
    }
}

