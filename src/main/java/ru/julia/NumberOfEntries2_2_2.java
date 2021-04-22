package ru.julia;

/**
 * 2.2.2 Определить число вхождений одной последовательности в другую, последовтельности не пересекаются
 */
public class NumberOfEntries2_2_2 {
    public static void main(String[] args) {
        String part = "cat";
        String word = "caterpillarcatratcatbat";
        numberOfEntries(part, word);
    }
    public static void numberOfEntries(String part, String word) {
        int count = 0;
        for (int i = 0; i < word.length() - part.length() + 1; i++) {
            String currentPart = word.substring(i, i + part.length());
//            System.out.println(currentPart);
            if (currentPart.equals(part)) {
                count = count + 1;
                i = i + part.length() - 1;
            }
        }
        System.out.println(count);
    }
}
