package edu.aegean.epta.java.week.two;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static edu.aegean.epta.java.week.two.ConsumerExercises.*;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerExercisesTest {

    @Test
    void testConsumerOne() {

        assertEquals("xyzabc", consumerOne("xyz"));
    }

    @Test
    void testConsumerTwo() {

        // arrange
        var input = new ArrayList<>(List.of("a", "b", "c"));


        // act
       var result = consumerTwo(input);

        // assert
        assertTrue(result.isEmpty());
    }

    @Test
    void testConsumerThree() {

        // arrange
        var input = new ArrayList<>(List.of("a", "b", "c"));


        // act
        var result = consumerThree(input);

        // assert
        assertTrue(result.isEmpty());
    }

    @Test
    void testConsumerFour() {

        // arrange
        var input = new ArrayList<>(List.of("a", "b", "c"));


        // act
        var result = consumerFour(input);

        // assert
        assertEquals(List.of("a", "b", "c", "first", "second"), result);
    }

}