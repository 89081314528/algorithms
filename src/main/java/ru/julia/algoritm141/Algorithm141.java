package ru.julia.algoritm141;

import ru.julia.Employee;

import java.util.ArrayList;
import java.util.List;

public class Algorithm141 {
    public static void main(String[] args) {
        Employee ivanov = new Employee("Ivanov", 45, 100_000);
        Employee petrov = new Employee("Petrov", 35, 100_000);
        Employee vanin = new Employee("Vanin", 40, 80_000);
        Employee petin = new Employee("Petin", 45, 10_000);
        Employee lenin = new Employee("Lenin", 35, 120_000);
        Employee stalin = new Employee("stalin", 40, 50_000);
        Employee putin = new Employee("putin", 35, 40_000);

//        List<Employee> list = new ArrayList<>(new Employee("Ivanov", 40, 100000));//почему не могу так сделать?
        List<Employee> list = new ArrayList<>();
        list.add(ivanov);
        list.add(petrov);
        list.add(vanin);
        list.add(petin);
        list.add(lenin);
        list.add(stalin);
        list.add(putin);

        List<Employee> newlist = bubbleSortByAge(list);
        printList(newlist);
    }
    public static List<Employee> bubbleSortByAge(List<Employee> list) {
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
            if (count == 0) {
                break;
            }
        }
        return list;
    }

    public static void printList(List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            Employee current = list.get(i);
            System.out.println(current.getSurname() + " " + current.getAge() + " " + current.getSalary());
        }
    }
}
