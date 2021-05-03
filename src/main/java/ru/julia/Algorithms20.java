package ru.julia;

/**
 * 20. Задано слово, посчитать, на сколько палиндромов его можно разбить
 */
public class Algorithms20 {
    public static void main(String[] args) {
        String str = "qwqtyueeeyuipopw";
        for (int start = 0; start < str.length() - 1; start++) {
            for (int i = 0; i < str.length() - start - 1; i++) {
                String current = str.substring(start, start + i + 2);
                if (isPalindrom(current)) {
                    System.out.println(current);
                    start = start + i + 1;
                    break;
                }
            }
        }
    }


    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }

}
