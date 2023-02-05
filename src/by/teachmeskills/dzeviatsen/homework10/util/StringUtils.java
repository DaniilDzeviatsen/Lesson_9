package by.teachmeskills.dzeviatsen.homework10.util;

import java.util.Arrays;

public class StringUtils {
    public static String deleteExtraSpace(String string) {
        string.trim();
        while (string.contains("  ")) {
            string = string.replace("  ", " ");
        }
        return string;
    }

    public static String getSecureNum(String string) {
        char[] chars = string.toCharArray();
        for (int i = 12; i < chars.length; i++) {
            chars[i] = '*';
        }

        string = String.valueOf(chars);
        String substr1 = string.substring(0, 4);
        String substr2 = string.substring(4, 8);
        String substr3 = string.substring(8, 12);
        String substr4 = string.substring(12, 16);
        string = substr1 + " " + substr2 + " " + substr3 + " " + substr4;
        return string;

    }

    public static String getShortName(String name, String surName, String middleName) {
        name = name.substring(0, 1) + ".";
        if (middleName != "") {
            middleName = middleName.substring(0, 1) + ".";
        }
        String shortName = surName + " " + name + middleName;
        return shortName;
    }

    public static boolean ifCorrectRBPassportNumber(String string) {
        boolean tr = false;
        if (string.length() == 9) {
            if (string.charAt(0) <= 'Z' && string.charAt(0) >= 'A' && string.charAt(1) >= 'A' && string.charAt(1) <= 'Z') {
                for (int i = 2; i < string.length(); i++) {
                    if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                        tr = true;
                    }
                }
            }
        }
        return tr;
    }

    public static boolean ifSafe(String string) {
        boolean tr = false;
        if (string.length() < 9) {
            return tr;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)>='0' && string.charAt(i)<='9'){
                for (int j=0; j<string.length();j++){
                    if (string.charAt(j)>='a'&&string.charAt(j)<='z'){
                        for (int k=0;k<string.length();k++){
                            if (string.charAt(k)>='A'&&string.charAt(k)<='Z'){
                                tr=true;
                            }
                        }
                    }
                }
            }
        }return tr;
    }
}

