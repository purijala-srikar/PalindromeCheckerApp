/**
 * =============================================
 *          UseCase4PalindromeCheckerApp
 * =============================================
 *
 * Use Case: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 *  - Converts string to char array
 *  - Uses start and end pointers
 *  - Compares characters
 *  - Displays the result efficiently
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "radar";

        boolean result = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Checks if the given string is a palindrome using two-pointer technique
     * on character array (case-sensitive, space-sensitive version)
     *
     * @param input the string to check
     * @return true if it is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return true;
        }

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        return isPalindrome;
    }
}