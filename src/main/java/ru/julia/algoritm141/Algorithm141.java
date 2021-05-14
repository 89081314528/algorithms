package ru.julia.algoritm141;

import ru.julia.Employee;

import java.util.ArrayList;
import java.util.List;

public class Algorithm141 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(List.of(
                new Employee("Ivanov", 45, 100_000),
                new Employee("Petrov", 35, 100_000),
                new Employee("Vanin", 40, 80_000),
                new Employee("Petin", 45, 10_000),
                new Employee("Lenin", 35, 120_000),
                new Employee("stalin", 40, 50_000),
                new Employee("putin", 35, 40_000)));
        List<Employee> newlist = bubbleSortByAge(list);
        printList(newlist);
    }

    public static Employee compareEmployees (Employee employee1, Employee employee2) {
        if (employee1.getAge() >= employee2.getAge()) {
            return employee1;
        } else {
            return employee2;
        }
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
