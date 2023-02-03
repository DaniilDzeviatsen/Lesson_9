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
                String text = sc.nextLine();
                System.out.println(StringUtils.isBlank(text));
            }
            case 3 -> {
                System.out.println("Enter text you want to be checked");
                String text = sc.nextLine();
                System.out.println(StringUtils.isRussian(text));
            }
            case 4 -> {
                System.out.println("Enter the part you wanna find");
                String text = sc.nextLine();
                System.out.println("Enter the text you wanna scan");
                String text2 = sc.nextLine();
                System.out.println(StringUtils.ifContains2(text, text2));
            }
            case 5 -> {
                char[] string = sc.nextLine().toCharArray();
                System.out.println(StringUtils.parseInt(string));
            }
            default -> System.out.println("You've entered wrong number");
        }
    }
}
