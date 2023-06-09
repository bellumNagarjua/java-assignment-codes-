import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int x = scanner.nextInt(); // Number of 10 rupee coins
            int y = scanner.nextInt(); // Number of 5 rupee coins

            int totalMoney = x * 10 + y * 5;
            System.out.println(totalMoney);
        }
    }
}
