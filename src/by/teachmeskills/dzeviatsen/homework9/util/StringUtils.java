package by.teachmeskills.dzeviatsen.homework9.util;

import java.util.Arrays;

public class StringUtils {


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


    public static boolean ifContains2(String text, String text2) {
        boolean tr = false;
        char[] charArray = text.toCharArray();
        char[] charArray2 = text2.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray2.length - 1; j++) {
                if (charArray[i] == charArray2[j]) {

                    for (int k = 1; k < charArray.length - 1; k++) {
                        if ((i + k) > charArray.length - 1 || (j + k) > charArray2.length - 1) {
                            tr = false;
                            return tr;
                        }
                        if (charArray[i + k] == charArray2[j + k]) {
                            tr = true;
                        }
                    }
                }
            }
        }
        return tr;
    }

    public static int parseInt(char[] array) {
        int finNum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            finNum = finNum * 10;
            finNum = finNum + num;
        }
        return finNum;
    }
}


