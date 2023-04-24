import java.util.Scanner;

public class LabRob583 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poverh = 1;
        int next_poverh;

        System.out.println("Ви знаходитесь на " + poverh + " поверсі");

        while (true) {
            System.out.println("Введіть номер поверху, на який хочете перейти (1-9):");
            next_poverh = scanner.nextInt();

            if (!(next_poverh >= 1 && next_poverh <= 9)) {
                System.out.println("Введено невірний номер поверху.");
                continue;
            }
            if (next_poverh > poverh)
                if (next_poverh == 2) {
                    System.out.println("Ви піднялися на 3 поверх.");
                    poverh = 3;
                    continue;
                }
            if (poverh > next_poverh)
                if (next_poverh == 2) {
                    System.out.println("Ви спустилися на 1 поверх.");
                    poverh = 1;
                    continue;
                }
            if (next_poverh > poverh) {
                for (int i = poverh; i < next_poverh; i++) {
                    System.out.println("Ви піднялися на " + (i + 1) + " поверх.");
                }
            } else if (next_poverh < poverh) {
                for (int i = poverh; i > next_poverh; i--) {
                    System.out.println("Ви спустилися на " + (i - 1) + " поверх.");
                }
            } else {
                System.out.println("Ви вже знаходитесь на цьому поверсі.");
                continue;
            }


        }
    }
}
