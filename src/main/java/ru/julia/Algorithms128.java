package ru.julia;

/**
 * 128. Даны 2 массива. Входит ли второй массив в первый?
 */
public class Algorithms128 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 0, 4, 6, 1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        int count = 0;
        int n = 0;
        for (int i = 0; i < array1.length - array2.length + 1; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i + j].equals(array2[j])) {
                    count = count + 1;
                }
            }
            if (count == array2.length) {
                System.out.println("входит");
                n = 1;
                break;
            } else {
                count = 0;
            }
        }
        if(n == 0) {
            System.out.println("не входит");
        }
    }
}

