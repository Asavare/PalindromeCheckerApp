/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC7 - Deque-Based Optimized Palindrome Checker
 * Version          : 1.0
 */

import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "level";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare front and rear until deque is empty
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}


