package by.teachmeskills.dzeviatsen.homework9.util;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println("Enter number of a Task");
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();
        switch (task) {
            case 2 -> {
                System.out.println("Enter text you want to be checked");
                String text=StringUtils.Input();
                System.out.println("Is the text blank?");
                System.out.println(StringUtils.isBlank(text));
            }
            case 3 -> {
                System.out.println("Enter text you want to be checked");
                String text = sc.next();
                System.out.println("Does the text contains just russian letters?");
                System.out.println(StringUtils.isRussian(text));
            }
            case 4 -> {
                System.out.println("Enter the part you wanna find");
                String text = sc.next();
                System.out.println("Enter the text you wanna scan");
                String text2 = sc.next();
                System.out.println(StringUtils.ifContains2(text, text2));
            }
            case 5 -> {
                System.out.println("Enter the number");
                String text=StringUtils.Input();
                char[] array = text.toCharArray();
                System.out.println(StringUtils.parseInt(array));
            }
            default -> System.out.println("You've entered wrong number");
        }
    }
}
