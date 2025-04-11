import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isSuccessful = false; // Flag to store the result

        if (isWeekend) {
            // Logic for weekend
            if (peanutButterCups >= 15 && peanutButterCups <= 25) {
                isSuccessful = true;
            }
            // No explicit else needed here, isSuccessful remains false if condition isn't met
        } else {
            // Logic for not weekend (weekday)
            if (peanutButterCups >= 10 && peanutButterCups <= 20) {
                isSuccessful = true;
            }
            // No explicit else needed here, isSuccessful remains false if condition isn't met
        }

        // Print the final result
        System.out.println(isSuccessful);

        scanner.close(); // Good practice to close the scanner
    }
}