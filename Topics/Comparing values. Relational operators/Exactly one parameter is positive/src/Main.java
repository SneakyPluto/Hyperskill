import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int positiveCount = 0;



        if (num1 > 0) {
            positiveCount++; // Increment if num1 is positive
        }
        if (num2 > 0) {
            positiveCount++; // Increment if num2 is positive
        }
        if (num3 > 0) {
            positiveCount++; // Increment if num3 is positive
        }
        boolean result = (positiveCount == 1);
        System.out.println(result);
    }

}