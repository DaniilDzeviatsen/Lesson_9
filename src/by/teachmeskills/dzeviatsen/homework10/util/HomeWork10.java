package by.teachmeskills.dzeviatsen.homework10.util;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println("Enter task number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("Enter the row you want to be corrected");
                String string = StringUtils.Input();
                System.out.println("Your corrected row:");
                System.out.println(StringUtils.deleteExtraSpace(string));
            }
            case 2 -> {
                System.out.println("Enter the number you want to become secure");
                String string = StringUtils.Input();
                StringUtils.deleteExtraSpace(string);
                System.out.println(StringUtils.getSecureNum(string));
            }
            case 3 -> {
                System.out.println("Enter name");
                String name = StringUtils.Input();
                StringUtils.deleteExtraSpace(name);
                System.out.println("Enter surname");
                String surName = StringUtils.Input();
                StringUtils.deleteExtraSpace(surName);
                System.out.println("Enter middlename");
                String middleName = StringUtils.Input();
                StringUtils.deleteExtraSpace(middleName);
                System.out.println("Your short name is");
                System.out.println(StringUtils.getShortName(name, surName, middleName));
            }
            case 4 -> {
                System.out.println("Enter passport number to check");
                String string = StringUtils.Input();
                StringUtils.deleteExtraSpace(string);
                System.out.println("Is this correct passport number?");
                System.out.println(StringUtils.ifCorrectRBPassportNumber(string));
            }
            case 5 -> {
                System.out.println("Enter the password you want to check");
                String string = StringUtils.Input();
                System.out.println("is your password safe?");
                System.out.println(StringUtils.ifSafe(string));
            }
            case 6 -> {
                System.out.println("enter e-mail adress");
                String string = StringUtils.Input();
                System.out.println("is it an e-mail adress?");
                System.out.println(StringUtils.ifEmailAdress(string));
            }
            default -> System.out.println("enter the number from 1 to 6");
        }
    }

}
