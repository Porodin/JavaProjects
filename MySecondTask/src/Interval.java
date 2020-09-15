import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        System.out.println("Введите ваше число:");
        Scanner scanner = new Scanner(System.in);
        int playerNum = scanner.nextInt();
        numericalGaps(playerNum);
    }

    public static void numericalGaps(int number) {
        Scanner scanner = new Scanner(System.in);
        if (number < 15) {
            System.out.println("[0-14]");
        } else if (number <= 35) {
            System.out.println("[15-35]");
        } else if (number <= 50) {
            System.out.println("[36-50]");
        } else if (number <= 100) {
            System.out.println("[51-100]");
            scanner.close();
        } else {
            System.out.println("Число не соответствует рамкам ввода");
        }
    }
}

