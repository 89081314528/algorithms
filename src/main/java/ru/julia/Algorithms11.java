package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 11. В интервале от а до b найти все парные простые числа, у парных числел разность равна двум.
 */
public class Algorithms11 {
    public static void main(String[] args) {
        int min = 1;
        int max = 5;
if (min == 1) {
    min = 2;
}
        for (int i = min; i <= max - 2 ; i++) {
            int current = i;
            int next = i + 2;
            if(numberIsPrime(current) && numberIsPrime(next)) {
                System.out.println(current + " " + next);
            }
        }
    }
    public static boolean numberIsPrime(int number) {
        List<Integer> dividersList = new ArrayList<>();
        for (int i = 2; i < number / 2 + 1; i++) { //если число 3 или 5, не заходит в цикл
            if (number % i == 0) {
                dividersList.add(i);
            }
        }
        if (dividersList.size() > 0) {
            return false;
        }
        return true;
    }

}
