package ru.julia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 141. Есть сотрудники - фамилия, год рождения, зарплата. Вывести на печать отсортированными по году
 * рождения в порядке возрастания, а внутри в порядке возрастания зарплаты
 * не доделала!!!
 */

public class Algorithms141 {
    public static void main(String[] args) {
        Employee ivanov = new Employee("Ivanov", 40, 100000);
        Employee petrov = new Employee("Petrov", 35, 100000);
        Employee vanin = new Employee("Vanin", 40, 80000);
        Employee petin = new Employee("Petin", 35, 10000);
        Employee lenin = new Employee("Lenin", 35, 120000);
        Employee stalin = new Employee("stalin", 40, 50000);
        Employee putin = new Employee("putin", 35, 40000);

//        List<Employee> list = new ArrayList<>(new Employee("Ivanov", 40, 100000));//почему не могу так сделать?
        List<Employee> list = new ArrayList<>();
        list.add(ivanov);
        list.add(petrov);
        list.add(vanin);
        list.add(petin);
        list.add(lenin);
        list.add(stalin);
        list.add(putin);

        List<Employee> newlist = bubbleSort(list);
        for (int i = 0; i < newlist.size(); i++) {
            Employee current = newlist.get(i);
            System.out.println(current.getSurname() + " " + current.getAge() + " " + current.getSalary());
        }
        bubbleSortInside(newlist);

    }
    public static List<Employee> bubbleSort(List<Employee> list) {
        for (int j = 0; j < list.size() - 1; j++) {
            int count = 0;
            for (int i = 0; i < list.size() - 1 - j; i++) {
                Employee current = list.get(i);
                Employee next = list.get(i + 1);
                if (current.getAge() > next.getAge()) {
                    list.set(i + 1, current);
                    list.set(i, next);
                    count = count + 1;
                }
            }

            if(count == 0) {
                break;
            }
        }
        return list;
    }

    public static void bubbleSortInside(List<Employee> list) {
        int start = 0;
        int finish = 0;
        for (int q = 0; q < list.size() - 1; q++) {
            if (list.get(q).getAge() == list.get(q + 1).getAge()) {
                finish = q + 1;
            } else {
                System.out.println("in");
                for (int j = start; j < finish + 1; j++) {
                    int count = 0;
                    for (int i = start; i < finish + 1 - j; i++) {
                        Employee current = list.get(i);
                        Employee next = list.get(i + 1);
                        if (current.getSalary() > next.getSalary()) {
                            list.set(i + 1, current);
                            list.set(i, next);
                            count = count + 1;
                        }
                    }

                    if(count == 0) {
                        break;
                    }
                }
                q = q + 1;
                start = q + 1;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Employee current = list.get(i);
            System.out.println(current.getSurname() + " " + current.getAge() + " " + current.getSalary());
        }
    }
}

