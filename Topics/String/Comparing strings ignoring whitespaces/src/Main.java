import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read two lines of input
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        // Remove all spaces in both strings
        String withoutSpaces1 = line1.replaceAll("\\s", "");
        String withoutSpaces2 = line2.replaceAll("\\s", "");

        // Compare the modified strings and print the result
        System.out.println(isEqual(withoutSpaces1, withoutSpaces2));
    }

    // Method to check if two strings are equal
    public static boolean isEqual(String one, String two) {
        return one.equals(two);
    }
}