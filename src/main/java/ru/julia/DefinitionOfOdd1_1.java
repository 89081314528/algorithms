package ru.julia;

/**
 * 1.1 Определение четности числа
 */
public class DefinitionOfOdd1_1 {
    public static void main(String[] args) {
        int number = 11;
        definitionOfOdd(number);
    }

    public static void definitionOfOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное");
        } else {
            System.out.println("Число " + number + " нечетное");
        }
    }
}
