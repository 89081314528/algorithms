package ru.julia;

/**
 * 129. Есть массив чисел. Найти самую длинную пилообразную последовательность а1<a2>a3<a4>a5
 * а1>a2<a3>a4 (больше трех)
 */
public class Algorithms129 {
    public static void main(String[] args) {
        Integer[] array = {2, 1, 2, 7, 7, 5, 6, 5, 6, 6};
        int time = 0;
        int count = 0;
        int maxLength = 0;
        int finish = 0;
        int maxFinish = 0;
        for (int i = 1; i < array.length - 2; i++) {
            int current = array[i];
            int previos = array[i - 1];
            int next = array[i + 1];
            int next2 = array[i + 2];
            if ((previos < current && current > next && next2 > next) ||
                    (previos > current && current < next && next2 < next)) {
                finish = i + 2;
                if (time == 0) {
                    count = 4;
                    time = time + 1;
                } else {
                    count = count + 1;
                }
                if ((i + 2) == array.length - 1); {
                    if (count > maxLength) {
                        maxLength = count;
                        maxFinish = finish;
                    }
                }
            } else {
                if (count > maxLength) {
                    maxLength = count;
                    maxFinish = finish;
                }
                count = 0;
                time = 0;
            }
        }
        System.out.println("maxLength = " + maxLength);
        for (int i = maxFinish - maxLength + 1; i <= maxFinish ; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
