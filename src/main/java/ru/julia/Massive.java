package ru.julia;

/**
 * Напечатать двумерный прямоугольный массив с нумерацией строк и столбцов.
 */
public class Massive {
    public static void main(String[] args) {
        int counter = 1;                              // заполнение двумерного массива
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("table.length = " + table.length);
        System.out.println("table[0].length = " + table[0].length);
        
        for (int i = 0; i < table.length; i++) {      // печать двумерного массива
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Двумерный массив с нумерацией строк и столбцов");
        for (int i = 0; i < table[0].length; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
