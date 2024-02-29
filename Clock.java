import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number of seconds: ");

        // Read the input from the user
        int seconds = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Convert seconds to hours
        double hours = (double) seconds / 3600.0;

        // Print the result
        System.out.println(seconds + " seconds is equal to " + hours + " hours.");
    }
}
