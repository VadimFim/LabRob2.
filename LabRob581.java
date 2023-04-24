public class LabRob581 {
    public static void main(String[] args) {
        int n = (int) (Math.random() *100);

        if (n > 50 && n < 100) {
            System.out.println("Число " + n + " в проміжку (50; 100)");
        } else {
            System.out.println("Число " + n + " не в проміжку (50; 100)");
        }
    }
}
