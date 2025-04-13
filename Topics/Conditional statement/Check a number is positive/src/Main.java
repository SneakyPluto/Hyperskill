import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int item = scanner.nextInt();
        if (item > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}