package edu.aegean.epta.java.recipes.week.five;

import edu.aegean.epta.java.recipes.week.five.IntermediateStreamsExercises;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntermediateStreamsExercisesTest {

    @Test
    void testStringToCharacters() {

        List<String> input = List.of("alfa", "bravo", "charlie");

        var result = IntermediateStreamsExercises.stringsToCharacters(input);

        assertEquals("[a, l, f, a, b, r, a, v, o, c, h, a, r, l, i, e]", result.toString());
        assertTrue(result.stream().allMatch(x -> x instanceof Character));
    }

    @Test
    void testListOfAllWords() throws IOException {

        var result = IntermediateStreamsExercises.listOfAllWords(reader);

        assertEquals(
                List.of(
                        "From", "fairest", "creatures", "we", "desire", "increase",
                        "That", "thereby", "beauty's", "rose", "might", "never", "die",
                        "But", "as", "the", "riper", "should", "by", "time", "decease",
                        "His", "tender", "heir", "might", "bear", "his", "memory",
                        "But", "thou", "contracted", "to", "thine", "own", "bright", "eyes",
                        "Feed'st", "thy", "light's", "flame", "with", "self", "substantial", "fuel",
                        "Making", "a", "famine", "where", "abundance", "lies",
                        "Thy", "self", "thy", "foe", "to", "thy", "sweet", "self", "too", "cruel",
                        "Thou", "that", "art", "now", "the", "world's", "fresh", "ornament",
                        "And", "only", "herald", "to", "the", "gaudy", "spring",
                        "Within", "thine", "own", "bud", "buriest", "thy", "content",
                        "And", "tender", "churl", "mak'st", "waste", "in", "niggarding",
                        "Pity", "the", "world", "or", "else", "this", "glutton", "be",
                        "To", "eat", "the", "world's", "due", "by", "the", "grave", "and", "thee"),
                result);
    }

    @Test
    void testLongLowerCaseSortedWords() throws IOException {

        var result = IntermediateStreamsExercises.longLowerCaseSortedWords(reader);

        assertEquals(
                List.of(
                        "abundance", "beauty's", "contracted", "creatures",
                        "increase", "niggarding", "ornament", "substantial"),
                result);
    }

    @Test
    void testSortedLowerCaseDistinctByLengthThenAlphabetically() throws IOException {

        var result = IntermediateStreamsExercises.sortedLowerCaseDistinctByLengthThenAlphabetically(reader);

        assertEquals(
                List.of(
                        "a", "as", "be", "by", "in", "or", "to", "we",
                        "and", "art", "bud", "but", "die", "due", "eat", "foe",
                        "his", "now", "own", "the", "thy", "too", "bear", "else",
                        "eyes", "from", "fuel", "heir", "lies", "only",
                        "pity", "rose", "self", "that", "thee", "this", "thou",
                        "time", "with", "churl", "cruel", "flame", "fresh", "gaudy",
                        "grave", "might", "never", "riper", "sweet", "thine",
                        "waste", "where", "world", "bright", "desire", "famine",
                        "herald", "mak'st", "making", "memory", "should", "spring",
                        "tender", "within", "buriest", "content", "decease",
                        "fairest", "feed'st", "glutton", "light's", "thereby", "world's", "beauty's",
                        "increase", "ornament", "abundance", "creatures", "contracted", "niggarding",
                        "substantial"),
                result);
    }

    @Test
    void testBigFactorial() throws IOException {

        var result = IntermediateStreamsExercises.bigFactorial();

        assertEquals(new BigInteger("51090942171709440000"), result);

    }

    @Test
    void testGetLastWord() throws IOException {

        var result = IntermediateStreamsExercises.getLastWord(reader);

        assertEquals("thee", result);

    }

    @Test
    void testSelectTheSuperClassesOfArrayList() throws IOException {

        var result = IntermediateStreamsExercises.selectTheSuperClassesOfArrayList();

        assertEquals(
                List.of(ArrayList.class, AbstractList.class, AbstractCollection.class, Object.class),
                result);
    }

    @Test
    void testCountTheElementsAfterAPredicate() throws IOException {

        var result = IntermediateStreamsExercises.countTheElementsAfterAPredicate();

        assertEquals(53, result);
    }

    // ========================================================
    // END OF EXERCISES
    // TEST INFRASTRUCTURE IS BELOW
    // ========================================================

    private BufferedReader reader;

    @BeforeEach
    public void z_setUpBufferedReader() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("poem.txt").getFile());

        reader = Files.newBufferedReader(
                Paths.get(file.getPath()), StandardCharsets.UTF_8);
    }

    @AfterEach
    public void z_closeBufferedReader() throws IOException {
        reader.close();
    }
}