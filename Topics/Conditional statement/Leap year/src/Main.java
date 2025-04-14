import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // If the whole condition is true, it's a Leap year
            System.out.println("Leap");
        } else {
            // Otherwise, it's a Regular year
            System.out.println("Regular");
        }
    }
}