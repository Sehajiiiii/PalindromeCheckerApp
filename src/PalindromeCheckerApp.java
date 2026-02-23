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

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String processedWord = word.toLowerCase();

        int length = processedWord.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (processedWord.charAt(i) != processedWord.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}