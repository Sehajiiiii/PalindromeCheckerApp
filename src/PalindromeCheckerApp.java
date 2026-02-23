import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();
        checkPalindrome();
    }

    public static void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP     ");
        System.out.println("=================================");
    }

    public static void checkPalindrome() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Remove all non-alphanumeric characters and convert to lowercase
        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = processed.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (processed.charAt(i) != processed.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}