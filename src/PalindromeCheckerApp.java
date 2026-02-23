import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (isPalindromeRecursive(processed, 0, processed.length() - 1)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }

    // Recursive Palindrome Check
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}