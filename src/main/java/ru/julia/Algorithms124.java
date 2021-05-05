package ru.julia;

/**
 * 124. Является ли данная последовательность периодической, то есть полученной повторением начальной части
 */
public class Algorithms124 {
    public static void main(String[] args) {
        String str = "123123123123";
        String test = "";
        for (int i = 2; i < str.length(); i++) {
            String part = str.substring(0, i);
            if(str.length() % part.length() == 0) {
                for (int j = 0; j < str.length() / part.length(); j++) {
                    test = test + part;
                }
                if (str.equals(test)) {
                    System.out.println("part = " + part);
                }
                test = "";
             }
        }
    }
}
