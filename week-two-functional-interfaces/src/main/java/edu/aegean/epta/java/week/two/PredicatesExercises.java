package edu.aegean.epta.java.week.two;

import java.util.function.Predicate;

public final class PredicatesExercises {

    /**
     * Write a lambda expression that is a predicate
     * that tests whether a string is longer than four characters.
     */
    public static boolean predicateOne(String input) {

        // TODO: change here the code.
        Predicate<String> predicate = null;


        return predicate.test(input);
    }

    /**
     * Write a lambda expression that is a predicate
     * that tests whether a string is empty.
     */
    public static boolean predicateTwo(String word) {

        // TODO: change here the code.
        Predicate<String> predicate = null;

        return predicate.test(word);
    }

    /**
     * Write an unbound method reference that is a predicate
     * that tests whether a string is empty. An unbound method
     * reference has a class name on the left-hand side of the ::
     * operator:
     *
     *     classname::methodname
     */
    public static boolean PredicateThree(String word) {

        // TODO: change here the code.
        Predicate<String> predicate = null;

        return predicate.test(word);
    }

    /**
     * Create a predicate that returns true the provided string
     * starts with 'J' character and the length is equal to 9
     * HINT: see java.util.function.Predicate.and()
     */
    public static boolean predicateFour(String word) {

        // TODO: change here the code.
        Predicate<String> predicate = null;

        return predicate.test(word);
    }


    /**
     * Create a predicate that is true if the length of the provided string
     * is 9 or the provided string equals ERROR.
     * HINT: see java.util.function.Predicate.or()
     */
    public static boolean predicateFive(String word) {

        //TODO: change here the code.
        Predicate<String> predicate = null;

        return predicate.test(word);
    }
}
