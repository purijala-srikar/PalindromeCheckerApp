/**
 * =============================================
 *          UseCase5PalindromeCheckerApp
 * =============================================
 *
 * Use Case: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 *  - Pushes characters into stack
 *  - Pops them in reverse order
 *  - Compares with original sequence
 *  - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "noon";

        boolean result = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Checks if the given string is a palindrome using a Stack.
     *
     * @param input the string to check
     * @return true if it is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null) return true;

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}