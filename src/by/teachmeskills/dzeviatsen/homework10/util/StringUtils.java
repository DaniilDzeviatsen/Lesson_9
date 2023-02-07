package by.teachmeskills.dzeviatsen.homework10.util;

import java.util.Scanner;

public class StringUtils {
    public static String deleteExtraSpace(String string) {
        string.trim();
        while (string.contains("  ")) {
            string = string.replace("  ", " ");
        }
        return string;
    }

    public static String getSecureNum(String string) {
        if (string.length() != 16) {
            throw new IllegalArgumentException("Enter correct number which contains 16 numerals");
        }
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length - 4; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                chars[i] = '*';
            } else {
                throw new IllegalArgumentException("Enter correct number which contains 16 numerals");
            }
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
        name = name.substring(0, 1).toUpperCase() + ".";
        if (middleName != "") {
            middleName = middleName.substring(0, 1).toUpperCase() + ".";
        }
        String shortName = surName.substring(0, 1).toUpperCase() + surName.substring(1) + " " + name + middleName;
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
            } else {
                tr = false;
            }
        }
        return tr;
    }

    public static boolean ifSafe(String string) {
        boolean tr = false;
        if (string.length() < 8) {
            return tr;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                for (int j = 0; j < string.length(); j++) {
                    if (string.charAt(j) >= 'a' && string.charAt(j) <= 'z') {
                        for (int k = 0; k < string.length(); k++) {
                            if (string.charAt(k) >= 'A' && string.charAt(k) <= 'Z') {
                                tr = true;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
        }
        return tr;
    }

    public static boolean ifEmailAdress(String string) {
        boolean tr = false;
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                if (string.charAt(i) == '@') {
                    counter += 1;
                    if (counter != 1) {
                        tr = false;
                        continue;
                    }
                    if (i != string.length() - 1 && i != 0) {
                        tr = true;
                    } else {
                        tr = false;
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return tr;
    }

    public static String Input() {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string;
    }

}

