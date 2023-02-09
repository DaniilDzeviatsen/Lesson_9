package by.teachmeskills.dzeviatsen.homework9.util;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtils {


    public static void print(char[] charArray) {
        for (char i : charArray) {
            System.out.print(i);
        }
    }

    public static void println(char[] array) {
        print(array);
        System.out.println();
    }


    public static boolean isBlank(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isWhitespace(charArray[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (!isRussian(charArray[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char charik) {
        return (charik >= 'А' && charik <= 'я') || charik == 'ё' || charik == 'Ë';
    }


    public static boolean ifContains2(char[] charArray, char[] charArray2) {
        boolean tr = false;
        int k = 0;
        if (charArray.length > charArray2.length) {
            return false;
        }
        for (int j = 0; j < charArray2.length; j++) {
            if (k > charArray.length - 1) {
                return true;
            }
            if (charArray[k] == charArray2[j]) {
                tr = true;
                k++;
            } else tr = false;
        }
        return tr;
    }

    public static int parseInt(char[] array) {
        int finNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > '9' || array[i] < '0') {
                throw new IllegalArgumentException("Input data contains not just numbers");
            }
            int num = array[i] - '0';
            finNum = finNum * 10;
            finNum = finNum + num;
        }
        return finNum;
    }

    public static char[] getArray() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toCharArray();
    }
}


