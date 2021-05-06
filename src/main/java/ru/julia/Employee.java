package ru.julia;

public class Employee {
    final String surname;
    final int age;
    final int salary;

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String surname, int age, int salary) {
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
}
