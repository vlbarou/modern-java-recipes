package edu.aegean.epta.java.week.two;

import java.util.function.BiFunction;
import java.util.function.Function;

public final class FunctionalExercises {

    /**
     * Write a lambda expression that wraps the given
     * string in parentheses.
     */
    public static String functionOne(String word) {
        // TODO: change here the code.
        Function<String, String> func = null;

        return func.apply(word);

    }

    /**
     * Write a lambda expression that converts the
     * given string to upper case.
     */

    public static String functionTwo(String word) {

        // TODO: change here the code.
        Function<String, String> func = null;

        return func.apply(word);
    }

    /**
     * Write an unbound method reference that converts the
     * given string to upper case.
     */
    public static String functionThree(String word) {

        // TODO: change here the code.
        Function<String, String> func = null;

        return func.apply(word);
    }

    /**
     * Given two Functions, one that converts a null reference to an
     * empty string, and another that gets the length of a string,
     * create a single function converts nulls and then gets the
     * string's length.
     * HINT: See java.util.Function.andThen() or java.util.Function.compose()
     */
    public static Integer functionFour(String word) {

        // TODO: change here the code.
        Function<String, Integer> function = null;

        return function.apply(word);
    }

    /**
     * Write a lambda expression that, given two strings, returns the result
     * of concatenating the first with the second, followed by the
     * first again.
     */
    public static String functionFive(String wordOne, String wordTwo) {
        // TODO: change here the code.
        BiFunction<String, String, String> bifunc = null;

        return bifunc.apply(wordOne, wordTwo);

    }

    /**
     * Write a lambda expression that returns the index of
     * the first occurrence of the second string within the first string,
     * or -1 if the second string doesn't occur within the first string.
     * Hint: // The String method
     *     public int indexOf(String)
     *   works as a BiFunction, because the receiver (a String instance)
     *   counts as the first argument. The argument to indexOf() becomes
     *   the second argument to the BiFunction.
     */
    public static int functionSix(String wordOne, String wordTwo) {

        // TODO: change here the code.
        BiFunction<String, String, Integer> bifunc = null;

        return bifunc.apply(wordOne, wordTwo);

    }

    /**
     * Write an unbound method reference that returns the index of
     * the first occurrence of the second string within the first string,
     * or -1 if the second string doesn't occur within the first string.
     */
    public static int functionSeven(String wordOne, String wordTwo) {
        // TODO: change here the code.
        BiFunction<String, String, Integer> bifunc = null;

        return bifunc.apply(wordOne, wordTwo);
    }

}
