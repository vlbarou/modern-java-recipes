package edu.aegean.epta.java.recipes.week.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AdvancedStreamsExercises {

    static final Pattern SPLIT_PATTERN = Pattern.compile("[- .:,]+");


    /**
     * Categorize the words from the text file into a map, where the map's key
     * is the length of each word, and the value corresponding to a key is a
     * list of words of that length. Don't bother with uniqueness or lower-
     * casing the words. As before, use the BufferedReader variable named
     * "reader" that has been set up for you to read from the text file, and
     * use SPLIT_PATTERN for splitting the line into words.
     * HINT:  Collectors.groupingBy().
     */
    public static Map<Integer, List<String>> mapLengthToWordList(BufferedReader reader) throws IOException {

        //TODO: Add your code here
        Map<Integer, List<String>> result = null;

        return result;
    }


    /**
     * Categorize the words from the text file into a map, where the map's key
     * is the length of each word, and the value corresponding to a key is a
     * count of words of that length. Don't bother with uniqueness or lower-
     * casing the words. This is the same as the previous exercise except
     * the map values are the count of words instead of a list of words.
     * HINT: Use the overload of Collectors.groupingBy() that has a "downstream" parameter.
     */
    public static Map<Integer, Long> mapLengthToWordCount(BufferedReader reader) throws IOException {

        //TODO: Add your code here
        Map<Integer, Long> result = null;

        return result;

    }


    /**
     * Gather the words from the text file into a map, accumulating a count of
     * the number of occurrences of each word. Don't worry about upper case and
     * lower case. Extra challenge: implement two solutions, one that uses
     * groupingBy() and the other that uses toMap().
     * HINT: For Collectors.groupingBy(), consider that each word needs to be in
     * a category of its own, that is, each word is categorized as itself. For Collectors.toMap(),
     * the first occurrence of a word should be mapped to 1.
     * If two elements of the Stream are generating the same key, you will need to
     *  provide a merging function.
     */
    public static Map<String, Long> wordFrequencies(BufferedReader reader) throws IOException {

        //TODO: Add your code here
        Map<String, Long> result = null;

        return result;

    }

    /**
     * From the words in the text file, create nested maps, where the outer map is a
     * map from the first letter of the word to an inner map. (Use a string of length
     * one as the key.) The inner map, in turn, is a mapping from the length of the
     * word to a list of words with that length. Don't bother with any lowercasing
     * or uniquifying of the words.
     *
     * For example, given the words "foo bar baz bazz foo" the string
     * representation of the result would be:
     *     {b={3=[bar, baz], 4=[bazz]}, f={3=[foo, foo]}}
     *
     * @throws IOException
     */
    public static Map<String, Map<Integer, List<String>>> nestedMaps(BufferedReader reader) throws IOException {

        //TODO: Add your code here
        Map<String, Map<Integer, List<String>>> result = null;

        return result;

    }

    /**
     * Given a stream of integers, compute separate sums of the even and odd values
     * in this stream. Since the input is a stream, this necessitates making a single
     * pass over the input.
     * Use Collectors.partitioningBy(). Note that the collect(Collector) method we need is defined
     * on Stream<T>, but not on IntStream, LongStream or DoubleStream.
     */
    public static  Map<Boolean, Integer> separateOddEvenSums(IntStream input) {

        //TODO: Add your code here
        Map<Boolean, Integer> result = null;

        return  result;

    }

    /**
     * Given a stream of strings, accumulate (collect) them into the result string
     * by inserting the input string at both the beginning and end. For example, given
     * input strings "x" and "y" the result should be "yxxy". Note: the input stream
     * is a parallel stream, so you MUST write a proper combiner function to get the
     * correct result.
     * ΗΙΝΤ: The collector state (that is, the object being accumulated and
     *  combined) can be a single StringBuilder, which is manipulated
     * by lambda expressions in the three-arg form of the collect() method.
     */
    public static String insertBeginningAndEnd(Stream<String> characters) {


        //TODO: Add your code here
        String result = characters.collect(null, null, null).toString();

        return result;
    }


}
