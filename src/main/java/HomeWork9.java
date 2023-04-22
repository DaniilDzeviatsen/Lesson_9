import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println("Enter number of a Task");
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();
        switch (task) {
            case 2 -> {
                System.out.println("Enter text you want to be checked");
                char[] charArray = StringUtils.getArray();
                System.out.println("Is the text blank?");
                System.out.println(StringUtils.isBlank(charArray));
            }
            case 3 -> {
                System.out.println("Enter text you want to be checked");
                char[] charArray = StringUtils.getArray();
                System.out.println("Does the text contain just russian letters?");
                System.out.println(StringUtils.isRussian(charArray));
            }
            case 4 -> {
                System.out.println("Enter the part you wanna find");
                char[] charArray = StringUtils.getArray();
                System.out.println("Enter the text you wanna scan");
                char[] charArray2 = StringUtils.getArray();
                System.out.println("Does big papa contain tiny papa?");
                System.out.println(StringUtils.ifContains2(charArray, charArray2));
            }
            case 5 -> {
                System.out.println("Enter the number");
                char[] charArray = StringUtils.getArray();
                System.out.println(StringUtils.parseInt(charArray));
            }
            default -> System.out.println("You've entered wrong number");
        }
    }
}
