import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        String input = scanner.nextLine();

        // Initialize a new string to store the result
        String result = "";

        // Iterate through each character of the original string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Take note: This is less efficient than StringBuilder
            result = result + currentChar + currentChar;
        }

        // Print the result to the standard output
        System.out.println(result);
    }
}