import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String userInput = scanner.nextLine();
        StringBuilder newBuilder = new StringBuilder();

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a') {
                newBuilder.append('b');
            } else {
                newBuilder.append(userInput.charAt(i));
            }
        }
        System.out.println(newBuilder);
    }
}