package edu.aegean.epta.java.week.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * This set of exercises covers simple stream pipelines,
 * including intermediate operations and basic collectors.
 *
 * Some of these exercises use a BufferedReader variable
 * named "reader" that the test has set up for you.
 */
public final class BasicStreamsExercises {

    /**
     * Given a list of words, create an output list that contains
     * only the odd-length words, converted to upper case.
     * HINT ONE:  Use filter() and map().
     * HINT TWO:  To create the result list, use collect() with one of the
     * predefined collectors on the Collectors class.
     */
    public static List<String> upcaseOddLengthWords(List<String> words) {


        // TODO: change here the code.
        List<String> result = words
                .stream()
                .filter(w -> w.length() % 2 != 0)
                .map(String::toUpperCase)
                .collect(toList());

        return result;

    }

    /**
     * Take the third through fifth words of the list, extract the
     * second letter from each, and join them, separated by commas,
     * into a single string. Watch for off-by-one errors.
     * HINT: Use Stream.skip() and Stream.limit() and Collectors.joining().
     */
    public static String joinStreamRange(List<String> words) {

        // TODO: change here the code.
        String result = words
                .stream()
                .limit(5)
                .skip(2)
                .map(s -> s.charAt(1))
                .map(Object::toString)
                .collect(Collectors.joining(","));

        return result;
    }


    /**
     * Count the number of lines in the text file. (Remember to
     * use the BufferedReader named "reader" that has already been
     * opened for you.
     * @throws IOException
     * HINT: Use BufferedReader.lines() to get a stream of lines and Stream.count()
     */
    public static long countLinesInFile(BufferedReader reader) throws IOException {

        // TODO: change here the code.
        long count = reader.lines().count();

        return count;
    }

    /**
     * Find the length of the longest line in the text file.
     *
     * @throws IOException
     * HINT: Use Stream.mapToInt() to convert a stream of objects to an IntStream.
     * Look at java.util.OptionalInt to get the result. Think about the case where the OptionalInt might be empty
     */
    public static int  findLengthOfLongestLine(BufferedReader reader) throws IOException {

        // TODO: change here the code.
        int longestLength = reader.lines().mapToInt(String::length).max().orElse(0);


       return longestLength;
    }

    /**
     * Find the longest line in the text file.
     *
     * @throws IOException
     * HINT: Use Stream.max() with a Comparator. Use static methods on Comparator to help create a Comparator instance.
     */
    public static String findLongestLine(BufferedReader reader) throws IOException {

        // TODO: change here the code.
        String longest = reader
                .lines()
                .max(Comparator.comparing((String::length)))
                .orElse("");

        return longest;
    }

    /**
     * Select the longest words from the input list. That is, select the words
     * whose lengths are equal to the maximum word length.
     * HINT: Consider making two passes over the input stream.
     */
    public static List<String> selectLongestWords(List<String> words) {

        // TODO: change here the code.
        int maxLength = words
                .stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        List<String> result = words
                .stream()
                .filter(w -> w.length() == maxLength)
                .collect(toList());

        return result;
    }

    /**
     * Select the list of words from the input list whose length is greater than
     * the word's position in the list (starting from zero) .
     * HINT:  Instead of a stream of words (Strings), run an IntStream of indexes of
     * the input list, using index values to get elements from the input list.
     */
    public static List<String> selectByLengthAndPosition(List<String> words) {

        // TODO: change here the code.
        IntStream indexes = IntStream.range(0, words.size());
        List<String> result = indexes
                .filter(i -> words.get(i).length() > i)
                .mapToObj(words::get)
                .collect(toList());

        return result;

    }

    /**
     * Convert a list of strings into a list of characters.
     * HINT: Use String.chars() and Stream.flatMap(). Pay attention to the return type of String.chars()
     * and boxing conversion.
     */
    public static List<Character> stringsToCharacters(List<String> words) {

        // TODO: change here the code.
        List<Character> result = words
                .stream()
                .flatMapToInt(String::chars)
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        return result;
    }
}
