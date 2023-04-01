package edu.aegean.epta.java.week.two;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class FunctionalExercises {

    /**
     * Write a lambda expression that wraps the given
     * string in parentheses.
     */
    public static String functionOne(String word) {
        // TODO: change here the code.
        Function<String, String> func = s -> "(".concat(s).concat(")");

        return func.apply(word);

    }

    /**
     * Write a lambda expression that converts the
     * given string to upper case.
     */

    public static String functionTwo(String word) {

        // TODO: change here the code.
        Function<String, String> func = String::toUpperCase;

        return func.apply(word);
    }

    /**
     * Write an unbound method reference that converts the
     * given string to upper case.
     */
    public static String functionThree(String word) {

        // TODO: change here the code.
        Function<String, String> func = FunctionalExercises::toUpperCase;

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
        Function<String, String> applyString = s -> Objects.requireNonNullElse(s, "");
        Function<String, Integer> getLength = String::length;

        Function<String, Integer> function = applyString.andThen(getLength);

        return function.apply(word);
    }

    /**
     * Write a lambda expression that, given two strings, returns the result
     * of concatenating the first with the second, followed by the
     * first again.
     */
    public static String functionFive(String wordOne, String wordTwo) {
        // TODO: change here the code.
        BiFunction<String, String, String> bifunc = (w1, w2) -> w1.concat(w2).concat(w1);

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
        BiFunction<String, String, Integer> bifunc = String::indexOf;

        return bifunc.apply(wordOne, wordTwo);

    }

    /**
     * Write an unbound method reference that returns the index of
     * the first occurrence of the second string within the first string,
     * or -1 if the second string doesn't occur within the first string.
     */
    public static int functionSeven(String wordOne, String wordTwo) {
        // TODO: change here the code.
        BiFunction<String, String, Integer> bifunc = FunctionalExercises::getIndexOfSubStr;

        return bifunc.apply(wordOne, wordTwo);
    }

    private static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    private static int getIndexOfSubStr(String str, String subStr) {
        return str.indexOf(subStr);
    }
}
