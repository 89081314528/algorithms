package ru.julia;

/**
 * 17. В интервале от а до b найти все палиндромы, квадраты которых тоже палиндромы.
 */
public class Algorithms17 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(isPalindrom(i) && isPalindrom(i * i)) {
                System.out.println(i + " " + i * i);
            }
        }
    }
    public static boolean isPalindrom(int number) {
        String str = Integer. toString(number);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }
}
