/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC2 - Print a Hardcoded Palindrome Result
 * Version          : 1.0
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome condition using if-else
        if (word.equals(reversed)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
