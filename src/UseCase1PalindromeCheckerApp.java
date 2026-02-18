/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC9 - Recursive Palindrome Checker
 * Version          : 1.0
 */

public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: if start >= end, string is palindrome
        if (start >= end) {
            return true;
        }
        // If mismatch found, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call for next characters
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "deified";

        // Call recursive palindrome checker
        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        // Display result
        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}


