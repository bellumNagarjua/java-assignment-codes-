//Java Program to Convert Milliseconds to Minutes and Seconds

Source Code:
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

class Millisecond {
    public static void main(String[] args) {

        long milliseconds;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the milliseconds: ");
        milliseconds = sc.nextLong();

        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");

        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
        System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
    }
}

Output:
Enter the milliseconds: 1000000
1000000 Milliseconds = 1000 Seconds
1000000 Milliseconds = 16 Minutes