/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC2 - Print a Hardcoded Palindrome Result
 * Version          : 1.0
 */

/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC3 - Palindrome Check Using String Reverse
 * Version          : 1.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        // Reversed String (Initially Empty)
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
