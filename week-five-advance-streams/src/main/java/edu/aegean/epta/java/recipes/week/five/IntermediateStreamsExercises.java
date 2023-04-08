package edu.aegean.epta.java.recipes.week.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public final class IntermediateStreamsExercises {

    static final Pattern SPLIT_PATTERN = Pattern.compile("[- .:,]+");

    /**
     * Convert a list of strings into a list of characters.
     * HINT: Use String.chars() and Stream.flatMap(). Pay attention to the return type of
     * String.chars() and boxing conversion.
     */
    public static List<Character> stringsToCharacters(List<String> words) {

        //TODO: Add your code here
        List<Character> result = null;


        return result;
    }

    /**
     * Collect all the words from the text file into a list.
     * Use the regular expression Pattern SPLIT_PATTERN to split
     * a string into words, and use Pattern.splitAsStream(String)
     * to do the splitting. SPLIT_PATTERN is defined at the bottom
     * of this file. As before, use the BufferedReader variable
     * named "reader" that has been set up for you to read from
     * the text file.
     * HINT:  Use Stream.flatMap().*
     */
    public static List<String> listOfAllWords(BufferedReader reader) throws IOException {

        //TODO: Add your code here
        List<String> result = null;

        return result;
    }

    /**
     * Read the words from the text file, and create a list containing the words
     * of length 8 or longer, converted to lower case, and sorted alphabetically.
     * HINT:  Use Stream.sorted().
     * @throws IOException
     */
    public static List<String> longLowerCaseSortedWords(BufferedReader reader) throws IOException {

        //TODO: Add your code here
        List<String> output = null;

        return output;
    }

    /**
     * Read words from the text file, and sort unique, lower-cased words by length,
     * then alphabetically within length, and place the result into an output list.
     * HINT: Stream.distinct() and  Comparator.thenComparing().
     * @throws IOException
     */
    public static List<String> sortedLowerCaseDistinctByLengthThenAlphabetically(BufferedReader reader) throws IOException {

        //TODO: Add your code here.
        List<String> result = null;

        return result;
    }

    /**
     * Compute the value of 21!, that is, 21 factorial. This value is larger than
     * Long.MAX_VALUE, so you must use BigInteger.
     * HINT: Use one of the range methods of LongStream to help create the BigInteger instances.  Use Stream.reduce()
     * to "collapse" all elements of a stream into
     */
    public static BigInteger bigFactorial() {

        //TODO: Add your code here
        BigInteger result = null;


        return result;
    }

    /**
     * Get the last word in the text file.
     *
     * @throws IOException
     * HINT:  Use Stream.reduce() and think about the order of the arguments.
     */
    public static String getLastWord(BufferedReader reader) throws IOException {

        //TODO: Add your code here
        String result = null;

        return result;
    }

    /**
     * Create a list containing ArrayList.class and all its super classes.
     * HINT: There is a getSuperClass() method on the Class class.
     * Creating a stream of these classes can be made with Stream.iterate().
     * Then you need to close that stream when the current class is null.
     * Use takeWhile() method on the stream interface.
     */
    public static List<Class<?>> selectTheSuperClassesOfArrayList() {
        Class<?> origin = ArrayList.class;

        //TODO: Add your code here
        List<Class<?>> result = null;

        return result;
    }

    /**
     * Count the length of a stream dropping the first elements on a predicate.
     * HINT:Use the the dropWhile() method on the stream interface.
     */
    public static long countTheElementsAfterAPredicate() {

        Random rand = new Random(314L);
        Stream<String> stream = Stream.iterate(
                "",
                (String s) -> {
                    final int nextInt = rand.nextInt(10);
                    return (nextInt == 0 && !s.isEmpty()) ? s.substring(0, s.length() - 1) :
                            (nextInt == 8 || nextInt == 9) ? s + "+"
                                    : s;
                }).limit(100);

        //TODO: Add your code here
        long count = -1;

        return count;
    }
}
