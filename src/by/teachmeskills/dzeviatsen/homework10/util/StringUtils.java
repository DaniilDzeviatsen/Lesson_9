package by.teachmeskills.dzeviatsen.homework10.util;

import java.util.Scanner;

public class StringUtils {
    public static final int CARD_NUMBER_LENGTH = 16;
    public static final int SECURED_NUMBER_LENGTH = 4;
    public static final int PASSPORT_NUM_LENGTH = 9;
    private static final int PASSWORD_LENGTH = 8;

    public static String deleteExtraSpace(String string) {
        string.trim();
        while (string.contains("  ")) {
            string = string.replace("  ", " ");
        }
        return string;
    }

    public static String getSecureNum(String string) {
        if (string.length() != CARD_NUMBER_LENGTH) {
            throw new IllegalArgumentException("Enter correct number which contains 16 numerals");
        }
        return "**** **** **** " + string.substring(CARD_NUMBER_LENGTH - SECURED_NUMBER_LENGTH);

    }


    public static String getShortName(String name, String surName, String middleName) {
        char firstLetterName = name.charAt(0);
        if (middleName.isEmpty()) {
            return "%s %s.".formatted(surName, firstLetterName);
        } else {
            char firstLetterMidName = middleName.charAt(0);
            return "%s %s. %s.".formatted(surName, firstLetterName, firstLetterMidName);
        }
    }

    public static boolean ifCorrectRBPassportNumber(String string) {
        boolean tr = true;
        if (string.length() != PASSPORT_NUM_LENGTH) {
            return false;
        }
        if (!(string.charAt(0) <= 'Z' && string.charAt(0) >= 'A' && string.charAt(1) >= 'A' && string.charAt(1) <= 'Z')) {
            return false;
        }
        for (int i = 2; i < PASSPORT_NUM_LENGTH; i++) {
            if (!(string.charAt(i) >= '0' && string.charAt(i) <= '9')) {
                return false;
            }
        }
        return tr;
    }


    public static boolean ifSafe(String string) {
        if (string.isBlank())
            throw new IllegalArgumentException("Password should not be blank");

        if (string.length() < PASSWORD_LENGTH)
            return false;

        int countOfUppercaseLetter = 0;
        int countOfLowerCaseLetter = 0;
        int countOfNumbers = 0;

        for (int i = 0; i < string.length(); i++) {
            if (isEnglishUpperCase(string.charAt(i)) || isRussianUpperCase(string.charAt(i)))
                countOfUppercaseLetter++;
            else if (Character.isDigit(string.charAt(i)))
                countOfNumbers++;
            else if (isEnglishLowerCase(string.charAt(i)) || isRussianLowerCase(string.charAt(i)))
                countOfLowerCaseLetter++;

            if (countOfNumbers >= 1 && countOfLowerCaseLetter >= 1 && countOfUppercaseLetter >= 1)
                return true;
        }

        return false;
    }

    public static boolean ifEmailAdress(String string) {
        if (string.contains(" ")) {
            return false;
        }
        int atIndex = string.indexOf('@');
        boolean isAtSingle = atIndex != -1 && atIndex == string.lastIndexOf("@");
        if (!isAtSingle) {
            return false;
        }
        boolean isAtSurrounded = atIndex != 0 && atIndex != string.length() - 1;
        return isAtSurrounded;
    }

    public static String Input() {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string;
    }
    public static boolean isRussianUpperCase(char letter) {
        if ((letter < 'А' || letter > 'Я') && letter != 'Ё' )
            return false;

        return true;
    }

    public static boolean isRussianLowerCase(char letter) {
        if ((letter < 'а' || letter > 'я') && letter != 'ё')
            return false;

        return true;
    }

    public static boolean isEnglishUpperCase(char letter) {
        if (!Character.isUpperCase(letter) || !Character.isLetter(letter))
            return false;

        return true;
    }

    public static boolean isEnglishLowerCase(char letter) {
        if (!Character.isLowerCase(letter))
            return false;

        return true;
    }

}

