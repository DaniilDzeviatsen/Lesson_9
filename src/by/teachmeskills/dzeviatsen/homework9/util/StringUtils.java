package by.teachmeskills.dzeviatsen.homework9.util;

import java.util.Arrays;

public class StringUtils {
    public static void main(String[] args) {
        print("abc");
        println("123");
        System.out.println("Строка пустая? " + isBlank("    "));
        System.out.println("Строка состоит полностью из букв русского алфавита? " + isRussian("авв"));
        System.out.println(ifContains2("elo", "hello"));
    }

    public static void print(String text) {
        char[] charArray = text.toCharArray();
        for (char i : charArray) {
            System.out.print(i);

        }
        System.out.print("\n");
    }

    public static void println(String text) {
        for (char i : text.toCharArray()) {
            System.out.print(i + "\n");
        }
    }

    public static boolean isBlank(String text) {
        boolean ifBlank = false;
        char[] charArray = text.toCharArray();
        if (charArray.length == 0) {
            ifBlank = true;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ' || charArray[i] == '\t' || charArray[i] == '\r' || charArray[i] == '\n') {
                ifBlank = true;
            }
        }
        return ifBlank;
    }

    public static boolean isRussian(String text) {
        char[] charArray = text.toCharArray();
        boolean tr = false;
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] >= 'а' && charArray[i] <= 'я') || (charArray[i] >= 'А' && charArray[i] <= 'Я')) {
                tr = true;
            } else {
                tr = false;
                return tr;
            }
        }
        return tr;
    }

    public static boolean ifContains(String text, String text2) {
        boolean tr = false;
        char[] charArray = text.toCharArray();
        char[] charArray2 = text2.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            for (int j = charArray2.length - 1; j >= 0; j--) {

                if (charArray[charArray.length - 1] == charArray2[charArray2.length - 1] && charArray[charArray.length - 2] == charArray2[charArray2.length - 2] && charArray[charArray.length - 3] == charArray2[charArray2.length - 3]) {
                    tr = true;
                }
            }
        }

        return tr;
    }

    public static boolean ifContains2(String text, String text2) {
        boolean tr = false;
        char[] charArray = text.toCharArray();
        char[] charArray2 = text2.toCharArray();
        for (int i = 0; i < charArray.length-1; i++) {
            for (int j = 0; j < charArray2.length-1; j++) {
                if (charArray[i] == charArray2[j]) {
                    if ((i + 1) > charArray.length-1 || (i + 2) > charArray.length-1||(j+1>charArray2.length-1||(j+2)>charArray2.length-1)) {
                        break;
                    }
                    if (charArray[i + 1] == charArray2[j + 1]) {
                        if (charArray[i + 2] == charArray2[j + 2]) {
                            tr = true;
                        }
                    }
                }
            }
        }return tr;
    }

}
