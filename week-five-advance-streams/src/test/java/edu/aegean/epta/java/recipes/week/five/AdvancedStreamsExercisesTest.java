package edu.aegean.epta.java.recipes.week.five;

import edu.aegean.epta.java.recipes.week.five.AdvancedStreamsExercises;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedStreamsExercisesTest {


    @Test
    void testMapLengthToWordList() throws IOException {

        var result = AdvancedStreamsExercises.mapLengthToWordList(reader);

        assertEquals(10, result.get(7).size());
        assertEquals(Set.of("beauty's", "increase", "ornament"), new HashSet<>(result.get(8)));
        assertEquals(Set.of("abundance", "creatures"), new HashSet<>(result.get(9)));
        assertEquals(Set.of("contracted", "niggarding"), new HashSet<>(result.get(10)));
        assertEquals(List.of("substantial"), result.get(11));
        assertFalse(result.containsKey(12));
    }

    @Test
    void testMapLengthToWordCount() throws IOException {

        var result = AdvancedStreamsExercises.mapLengthToWordCount(reader);

        assertEquals(Map.ofEntries(entry( 1,  1L),
                        entry( 2, 11L),
                        entry( 3, 28L),
                        entry( 4, 21L),
                        entry( 5, 16L),
                        entry( 6, 12L),
                        entry( 7, 10L),
                        entry( 8,  3L),
                        entry( 9,  2L),
                        entry(10,  2L),
                        entry(11,  1L)),
                result);
    }

    @Test
    void testWordFrequencies() throws IOException {

        var result = AdvancedStreamsExercises.wordFrequencies(reader);

        assertEquals(2L, (long)result.get("tender"));
        assertEquals(6L, (long)result.get("the"));
        assertEquals(1L, (long)result.get("churl"));
        assertEquals(2L, (long)result.get("thine"));
        assertEquals(1L, (long)result.get("world"));
        assertEquals(4L, (long)result.get("thy"));
        assertEquals(3L, (long)result.get("self"));
        assertFalse(result.containsKey("lambda"));
    }

    @Test
    void testNestedMaps() throws IOException {

        var result = AdvancedStreamsExercises.nestedMaps(reader);

        assertEquals("[abundance]", result.get("a").get(9).toString());
        assertEquals("[by, be, by]", result.get("b").get(2).toString());
        assertEquals("[flame, fresh]", result.get("f").get(5).toString());
        assertEquals("[gaudy, grave]", result.get("g").get(5).toString());
        assertEquals("[should, spring]", result.get("s").get(6).toString());
        assertEquals("[substantial]", result.get("s").get(11).toString());
        assertEquals("[the, thy, thy, thy, too, the, the, thy, the, the, the]",
                result.get("t").get(3).toString());
        assertEquals("[where, waste, world]", result.get("w").get(5).toString());
    }

    @Test
    void testSeparateOddEvenSums() throws IOException {

        IntStream input = new Random(987523)
                .ints(20, 0, 100);

        var result = AdvancedStreamsExercises.separateOddEvenSums(input);

        assertEquals(516,  result.get(false));
        assertEquals(614,  result.get(true));
    }

    @Test
    void testInsertBeginningAndEnd() throws IOException {

        Stream<String> input = List.of(
                        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                        "k", "l", "m", "n", "o", "p", "q", "r", "s", "t")
                .parallelStream();

        var result = AdvancedStreamsExercises.insertBeginningAndEnd(input);

        assertEquals("tsrqponmlkjihgfedcbaabcdefghijklmnopqrst", result);

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