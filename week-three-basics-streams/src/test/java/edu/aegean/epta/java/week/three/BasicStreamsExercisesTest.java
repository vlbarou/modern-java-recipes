package edu.aegean.epta.java.week.three;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static edu.aegean.epta.java.week.three.BasicStreamsExercises.*;
import static org.junit.jupiter.api.Assertions.*;
class BasicStreamsExercisesTest {

    @Test
    void testUppercaseOddLengthWords() {

        // arrange
        var input =  List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

        // act
        var result = upcaseOddLengthWords(input);

        // assert
        assertEquals(List.of("BRAVO", "CHARLIE", "DELTA", "FOXTROT"), result);


    }

    @Test
    void testJoinStreamRange() {

        // arrange
        List<String> input = List.of(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

        // act
        var result = joinStreamRange(input);

        // assert
        assertEquals("h,e,c", result);

    }

    @Test
    void testCountLinesInFile() throws IOException {

        // act
        var result = countLinesInFile(reader);

        // assert
        assertEquals(14, result);
    }

    @Test
    void testFindLengthOfLongestLine() throws IOException {

        // act
        var result = findLengthOfLongestLine(reader);

        // assert
        assertEquals(53, result);
    }

    @Test
    void testFindLongestLine() throws IOException {

        // act
        var result = findLongestLine(reader);

        // assert
        assertEquals("Feed'st thy light's flame with self-substantial fuel,", result);

    }

    @Test
    void tesSelectLongestWords() {

        // arrange
        List<String> input = List.of(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");

        // act
        var result = selectLongestWords(input);

        // assert
        assertEquals(List.of("charlie", "foxtrot"), result);

    }

    @Test
    void testSelectByLengthAndPosition() {

        // arrange
        List<String> input = List.of(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");

        // act
        var result = selectByLengthAndPosition(input);

        // assert
        assertEquals(List.of("alfa", "bravo", "charlie", "delta", "foxtrot"), result);

    }

    @Test
    void testStringsToCharacters() {

        // arrange
        List<String> input = List.of("alfa", "bravo", "charlie");


        // act
        var result = stringsToCharacters(input);

        // assert
        assertEquals("[a, l, f, a, b, r, a, v, o, c, h, a, r, l, i, e]", result.toString());
        assertTrue(result.stream().allMatch(x -> x instanceof Character));

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
