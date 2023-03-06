package edu.aegean.epta.java.week.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static edu.aegean.epta.java.week.two.FunctionalExercises.*;

class FunctionalExercisesTest {

    @Test
    void testFunctionOne() {
        assertEquals("(abc)", functionOne("abc"));

    }

    @Test
    void testFunctionTwo() {

        assertEquals("ABC", functionTwo("abc"));
    }

    @Test
    void testFunctionThree() {

        assertEquals("ABC", functionThree("abc"));
    }

    @Test
    void testFunctionFour() {


        assertEquals((Integer) 14, functionFour("Hello JavaOne!"));
        assertEquals((Integer) 0, functionFour(""));
        assertEquals((Integer) 0, functionFour(null));
    }

    @Test
    void testFunctionFive() {

        assertEquals("FirstSecondFirst", functionFive("First", "Second"));

    }

    @Test
    void testFunctionSix() {

        assertEquals(3, functionSix("abcdefghi", "def"));
        assertEquals(-1, functionSix("abcdefghi", "xyz"));
    }

    @Test
    void testFunctionSeven() {

        assertEquals(3, functionSeven("abcdefghi", "def"));
        assertEquals(-1, functionSeven("abcdefghi", "xyz"));
    }


}