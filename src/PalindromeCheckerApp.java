import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();
        checkPalindromeUsingMiddle();
    }

    public static void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP     ");
        System.out.println("=================================");
    }

    public static void checkPalindromeUsingMiddle() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int length = word.length();
        boolean isPalindrome = true;

        // Compare characters from start and end moving toward middle
        for (int i = 0; i < length / 2; i++) {

            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        scanner.close();
    }
}