import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new scanner object for user input
        Scanner input = new Scanner(System.in);

        // Waiting for user input
        char inputChar = input.next().charAt(0); // apparently the use of a chained method call here is bad

        // Perform operation on character here and print the result
        System.out.println(++inputChar); // Value of pre-increment expression '++inputChar' is used
    }
}