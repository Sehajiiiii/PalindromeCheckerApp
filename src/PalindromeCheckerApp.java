public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();
        checkHardcodedPalindrome();
    }

    public static void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP     ");
        System.out.println("=================================");
    }

    public static void checkHardcodedPalindrome() {

        String word = "madam";   // Hardcoded value
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Word: " + word);

        if (word.equals(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
    }
}