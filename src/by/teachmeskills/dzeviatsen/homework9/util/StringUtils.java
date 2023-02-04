package by.teachmeskills.dzeviatsen.homework9.util;

import java.util.Arrays;
import java.util.Scanner;

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
        int k = 0;
        char[] charArray = text.toCharArray();
        char[] charArray2 = text2.toCharArray();

            for (int j = 0; j < charArray2.length; j++) {
                if (charArray[k] == charArray2[j]) {
                    if ((k) > charArray.length-1) {
                        break;
                    }
                    tr = true;
                    k++;
                }
            }return tr;
        }




    //не работает корректно, не знаю как исправить(если есть в первой строке и во второй
    //по два совподающих элемента подряд то выводит true, если нет false


    public static int parseInt(char[] array) {
        int finNum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i] - '0';
            finNum = finNum * 10;
            finNum = finNum + num;
        }
        return finNum;
    }

    public static String Input() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line;
    }
}


