package edu.aegean.epta.java.week.two;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static edu.aegean.epta.java.week.two.DefaultMethodsExercises.*;
import static org.junit.jupiter.api.Assertions.*;

class DefaultMethodsExercisesTest {

    @Test
    void testAppendNew() {

        // arrange
        List<StringBuilder> input = List.of(
                new StringBuilder("alfa"),
                new StringBuilder("bravo"),
                new StringBuilder("charlie"));

        // act
        var result = appendNew(input);

        // assert
        assertEquals(List.of("alfanew", "bravonew", "charlienew"),
                result.stream()
                        .map(StringBuilder::toString)
                        .collect(Collectors.toList()));

    }

    @Test
    void testRemoveOddLengthWords() {

        // arrange
        List<String> input = new ArrayList<>(Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));

        // act
        var result = removeOddLengthWords(input);

        // assert
        assertEquals(List.of("alfa", "echo"), result);

    }

    @Test
    void testUppercaseAllWords() {

        // arrange
        List<String> input = Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

        // act
        var result = uppercaseAllWords(input);

        // assert
        assertEquals(List.of("ALFA", "BRAVO", "CHARLIE", "DELTA", "ECHO", "FOXTROT"),
                input);

    }

    @Test
    void testAppendToMapValues() {

        // arrange
        Map<Integer, StringBuilder> input = new TreeMap<>();
        input.put(1, new StringBuilder("alfa"));
        input.put(2, new StringBuilder("bravo"));
        input.put(3, new StringBuilder("charlie"));


        // act
        var result = appendToMapValues(input);

        // assert
        assertEquals(3, result.size());
        assertTrue(result.values().stream().allMatch(x -> x instanceof StringBuilder));
        assertEquals("alfa1",    result.get(1).toString());
        assertEquals("bravo2",   result.get(2).toString());
        assertEquals("charlie3", result.get(3).toString());

    }

    @Test
    void testReplaceMapValues() {

        // arrange
        Map<Integer, String> input = new TreeMap<>();
        input.put(1, "alfa");
        input.put(2, "bravo");
        input.put(3, "charlie");


        // act
        var result = replaceMapValues(input);

        // assert
        assertEquals(Map.of(1, "alfa1",
                        2, "bravo2",
                        3, "charlie3"),
                result);
    }

    @Test
    void testMapOfListOfStringsByLength() {

        // arrange
        List<String> list = List.of(
                "aardvark", "bison", "capybara",
                "alligator", "bushbaby", "chimpanzee",
                "avocet", "bustard", "capuchin");

        // actt
        var result = mapOfListOfStringsByLength(list);

        // assert
        assertEquals(Map.of( 5, List.of("bison"),
                        6, List.of("avocet"),
                        7, List.of("bustard"),
                        8, List.of("aardvark", "capybara", "bushbaby", "capuchin"),
                        9, List.of("alligator"),
                        10, List.of("chimpanzee")),
                result);
    }

    @Test
    void testMapOfStringByInitialCharacter() {

        // arrange
        List<String> input = List.of(
                "aardvark", "bison", "capybara",
                "alligator", "bushbaby", "chimpanzee",
                "avocet", "bustard", "capuchin");

        // actt
        var result = mapOfStringByInitialCharacter(input);

        // assert
        assertEquals(Map.of('a', "aardvark:alligator:avocet",
                        'b', "bison:bushbaby:bustard",
                        'c', "capybara:chimpanzee:capuchin"),
                result);
    }
}