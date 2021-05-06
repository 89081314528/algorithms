package ru.julia;

/**
 * 126. Есть массив чисел, найти длину максимального палиндрома
 */
public class Algorithms126 {
    public static void main(String[] args) {
        String str = "aaaottttttppppppp";
        System.out.println(isPalindrom(str));
        int max = 0;
        String maxPalindrom = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - i; j++) {
                String part = str.substring(i, str.length() - j);
                System.out.println("part = " + part);;
                if (isPalindrom(part)) {
                    System.out.println("polindrom = " + part);
                    if (part.length() > max) {
                        max = part.length();
                        maxPalindrom = part;
                    }
                }
            }
        }
        System.out.println("maxPalindrom = " + maxPalindrom);
        System.out.println("max = " + max);
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
