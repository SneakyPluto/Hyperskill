import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed
        int currentTemperature = 0;
        // Add your while loop or do-while loop here to process input temperatures
        while (maxTemperature <= 100) {
            currentTemperature = scanner.nextInt();
            if (currentTemperature > 99) {
                break;
            } else if (currentTemperature < 100) {
                if (currentTemperature > maxTemperature) {
                    maxTemperature = currentTemperature;
                }
            }
        }
        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}