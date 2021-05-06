package ru.julia;

/**
 * 132. Есть массив. Найти подмассив с максимальной суммой.
 */
public class Algorithms132 {
    public static void main(String[] args) {
        Integer[] array = {2, 100, -90, 90, 7, -200, 6, 5, 6, 60};
        int maxSum = 0;
        int maxFinish = 0;
        int maxCount = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                for (int k = i; k < array.length - j; k++) {
                    sum = sum + array[k];
                    count = count + 1;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    maxFinish = array.length - j - 1;
                    maxCount = count;
                }
                sum = 0;
                count = 0;
            }
        }
        System.out.println("maxSum = " + maxSum);
        for (int i = maxFinish - maxCount + 1; i <= maxFinish ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}