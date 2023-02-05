package by.teachmeskills.dzeviatsen.homework10.util;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println(StringUtils.deleteExtraSpace("                    j iih   i     j            "));
        System.out.println(StringUtils.getSecureNum("1234567891234567"));
        System.out.println(StringUtils.getShortName("Daniil", "Dzeviatsen", "Pavlovich"));
        System.out.println(StringUtils.ifCorrectRBPassportNumber("MC1234567"));
        System.out.println(StringUtils.ifSafe("123asSwkfkwef"));
    }

}
