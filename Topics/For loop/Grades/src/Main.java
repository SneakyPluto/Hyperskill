import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numGrades = scanner.nextInt();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int i = 0; i <= numGrades; i++) {
            String letter = scanner.nextLine();
            if ("A".equals(letter)) {
                ++aCount;
            } else if ("B".equals(letter)) {
                ++bCount;
            } else if ("C".equals(letter)) {
                ++cCount;
            } else if ("D".equals(letter)) {
                ++dCount;
            }
        }
        System.out.printf("%d %d %d %d%n", dCount, cCount, bCount, aCount);
    }
}