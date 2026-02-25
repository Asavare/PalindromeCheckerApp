/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC10 - Case-Insensitive & Space-Ignored Palindrome
 * Version          : 1.0
 */

public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Check palindrome
        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome (ignoring case and spaces).");
        }

        System.out.println("Program executed successfully.");
    }
}



