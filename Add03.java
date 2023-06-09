import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read the two integers A and B
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // Calculate the sum of A and B
            int sum = A + B;

            // Print the sum
            System.out.println(sum);
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
