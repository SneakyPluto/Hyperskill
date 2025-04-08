import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String line1 = scanner.nextLine();

        // Read integers
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        String sliced = line1.substring(startIndex, endIndex + 1);
        System.out.println(sliced);

    }
}