package edu.aegean.epta.java.week.two;

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
}
