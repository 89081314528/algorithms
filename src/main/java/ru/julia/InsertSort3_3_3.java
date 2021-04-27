package ru.julia;

import java.util.ArrayList;
import java.util.List;

/** 3.3.2 Cортировка выбором
 */
public class InsertSort3_3_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers.add(number);
        }
        System.out.println(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            for (int j = 0; j < i; j++) {
                if (current < numbers.get(i - 1 - j)) {
                    numbers.set(i - j, numbers.get(i - 1 - j));
                    if(i - j == 1) {
                        numbers.set(0, current);
                    }
                }
                else {
                    numbers.set(i - j, current);
                    break;
                }
            }
        }
        System.out.println(numbers);
    }
}
