import java.util.Scanner;

public class CountNumberBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the second number (n): ");
        int n = scanner.nextInt();
            int count = 0;

            for (int i = m + 1; i < n; i++) {
                count++;
            }

            System.out.println("The count of numbers between " + m + " and " + n + " (excluding them) is: " + count);
        }
    }
}
