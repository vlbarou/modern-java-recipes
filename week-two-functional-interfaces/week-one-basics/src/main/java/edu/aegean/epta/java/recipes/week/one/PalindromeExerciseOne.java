package edu.aegean.epta.java.recipes.week.one;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PalindromeExerciseOne {

    /**
     * TODO: Refactor this method using lambdas to check all values that are palindromes. The junit tests must be passed
     */
    public static boolean isAllPalindrome(List<String> values) {

        AtomicBoolean isPalindrome = new AtomicBoolean(true);

        //HINT: ser forEach method from List interface andd use a Consumer functional interface.
        for (String value : values) {
            if (isPalindrome(value)) {
                System.out.println("String: " + value + " is Palindrome");
            } else {
                System.out.println("String: '<" + value + ">' is NOT Palindrome");
                isPalindrome.set(false);
            }
        }

        return isPalindrome.get();
    }


    public static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String forward = sb.toString().toLowerCase();
        String backward = sb.reverse().toString().toLowerCase();
        return forward.equals(backward);
    }
}
