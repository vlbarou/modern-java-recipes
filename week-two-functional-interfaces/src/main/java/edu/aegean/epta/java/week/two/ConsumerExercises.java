package edu.aegean.epta.java.week.two;

import java.util.List;
import java.util.function.Consumer;

public final class ConsumerExercises {

    /**
     * Write a lambda expression that appends the
     * string "abc" to the given StringBuilder.
     */
    public static String consumerOne(String word) {
        StringBuilder sb = new StringBuilder(word);

        // TODO: change here the code.
        Consumer<StringBuilder> cons = b -> b.append("abc");

        cons.accept(sb);

        return sb.toString();
    }

    /**
     * Write a lambda expression that clears the given list.
     */
    public static List<String> consumerTwo(List<String> words) {

        // TODO: change here the code.
        Consumer<List<String>> cons = List::clear;

        cons.accept(words);

        return words;
    }
//
    /**
     * Write an unbound method reference that clears the given list.
     */
    public static List<String> consumerThree(List<String> words) {

        // TODO: change here the code.
        Consumer<List<String>> cons = ConsumerExercises::clearList;

        cons.accept(words);

        return words;
    }
//
    /**
     * Given two consumers, create a consumer that passes the String to the
     * first consumer, then to the second.
     * HINT: see java.util.function.Consumer.andThen()
     */
    public static List<String> consumerFour(List<String> words) {
        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        // TODO: change here the code.
        Consumer<List<String>> consumer = c1.andThen(c2);


        consumer.accept(words);
        return words;
    }

    private static void clearList(List list) {
        list.clear();
    }
}