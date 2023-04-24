import java.util.Scanner;

public class LabRob582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть тризначне число: ");
        int number = scanner.nextInt();

        int Number1 = number / 100;
        int Number2 = (number / 10) % 10;
        int Number3 = number % 10;

        int maxDigit = Number1;
        if (Number2 > maxDigit) {
            maxDigit = Number2;
        }
        if (Number3 > maxDigit) {
            maxDigit = Number3;
        }

        System.out.println("Найбільша цифра в числі " + number + " - це " + maxDigit);
    }
}
