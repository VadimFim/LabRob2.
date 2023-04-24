import java.util.Scanner;

public class LabRob584 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Меню:");
        System.out.println("1. Погодитись");
        System.out.println("2. Відмовитись");
        System.out.print("Введіть варіант (1/2): ");
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введіть вашу відповідь: ");
            String answer = scanner.nextLine();
            switch (choice) {
                case 1:
                    if (answer.matches("(?i)Так|ОК|Yes|Y|\\+|Ok")) {
                        System.out.println("Я погоджуюсь!");
                    } else {
                        System.out.println("Невідповідна відповідь.");
                    }
                    break;
                case 2:
                    if (answer.matches("(?i)Ні|NO|N|\\-|No")) {
                        System.out.println("Я відмовляюсь!");
                    } else {
                        System.out.println("Невідповідна відповідь.");
                    }
                    break;
                default:
                    System.out.println("Невірний варіант.");
                    break;
            }
        } else {
            System.out.println("Невірний варіант.");
        }
        scanner.close();
    }
}
