import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int loopLength = scanner.nextInt();
        int itemQuality;

        // Flags
        int fixed = 0;
        int reject = 0;
        int ready = 0;

        for (int i = 0; i < loopLength; i++) {
            itemQuality = scanner.nextInt();
            if (itemQuality == 1) {
                ++fixed;
            } else if (itemQuality == -1) {
                ++reject;
            } else if (itemQuality == 0) {
                ++ready;
            }
        }
        System.out.printf("%d %d %d%n", ready, fixed, reject);
    }
}