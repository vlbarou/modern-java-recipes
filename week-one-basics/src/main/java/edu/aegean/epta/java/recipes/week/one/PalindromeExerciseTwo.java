package edu.aegean.epta.java.recipes.week.one;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PalindromeExerciseTwo {

    /**
     * DO not edit
     */
    public static boolean isAllPalindrome(List<String> palindromes) {

        AtomicBoolean isPalindrome = new AtomicBoolean(true);

        //HINT: ser forEach method from List interface andd use a Consumer functional interface.
        boolean result = palindromes
                .stream()
                .allMatch(PalindromeCheckerInterface::checkPalindrome);

        System.out.println("Section 1 :: Task 2 :: Using a functional Interface to check a string is palindrome ");
        if (result) {
            System.out.println("Success :: all strings are palindrome.");
        } else {
            System.out.println("Failed :: not all strings are palindrome");
        }


        return result;
    }

    /*
    *  TODO: Add your code here to implement a palindrome checker in static method
     */
    @FunctionalInterface
    interface PalindromeCheckerInterface {
        boolean isPalindrome();

        static boolean checkPalindrome(String word) {

            //HINT: Modify the previous implementation.

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
}
