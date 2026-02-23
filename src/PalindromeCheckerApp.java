import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();
<<<<<<< HEAD
        checkPalindromeUsingMiddle();
=======
        checkHardcodedPalindrome();
>>>>>>> feature/UC2
    }

    public static void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP     ");
        System.out.println("=================================");
    }

<<<<<<< HEAD
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
=======
    public static void checkHardcodedPalindrome() {

        String word = "madam";   // Hardcoded value
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Word: " + word);

        if (word.equals(reversed)) {
>>>>>>> feature/UC2
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
<<<<<<< HEAD

        scanner.close();
=======
>>>>>>> feature/UC2
    }
}