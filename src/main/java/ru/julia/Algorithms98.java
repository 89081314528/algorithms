package ru.julia;

/**
 * 98. В массиве, заполненном наполовину, продублировать элементы с сохранением порядка их следования
 * Например, массив 3, 8, 9 преобразуется в 3, 3, 8, 8, 9, 9
 */
public class Algorithms98 {
    public static void main(String[] args) {
        int[] massive = new int[10];
        massive[0] = 3;
        massive[1] = 8;
        massive[2] = 9;
        massive[3] = 7;
        massive[4] = 8;
        printMassive(massive);
        for (int i = 0; i < massive.length; i = i + 2) {
            shiftOnePosition(massive, i);
        }
        printMassive(massive);
    }

    public static int[] shiftOnePosition(int[] massive, int start) {
        for (int j = 0; j < massive.length - 1 - start; j++) {
            massive[massive.length - 1 - j] = massive[massive.length - 2 - j];

        }
        return massive;
    }

    public static void printMassive(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
    }
}
