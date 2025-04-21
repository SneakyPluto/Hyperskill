import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sequence = scanner.nextInt();
        int divisibleBySixSum = 0;
        for (int i = 0; i < sequence; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                divisibleBySixSum += num;
            }
        }
        System.out.println(divisibleBySixSum);
    }
}