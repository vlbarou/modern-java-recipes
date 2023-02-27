package edu.aegean.epta.java.recipes.week.one;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static edu.aegean.epta.java.recipes.week.one.PalindromeExerciseOne.isAllPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeExerciseOneTest {

    @Test
    public void isPalindrome() {

        // a
        List<String> palidromes = Arrays.asList(
                "Madam, in Eden, I'm Adam",
                "Flee to me, remote elf!",
                "Go hang a salami; I'm a lasagna hog"
        );

        boolean result = isAllPalindrome(palidromes);

        assertTrue(result);
    }

}