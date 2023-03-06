package edu.aegean.epta.java.week.two;


import org.junit.jupiter.api.Test;

import static edu.aegean.epta.java.week.two.PredicatesExercises.predicateFive;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static edu.aegean.epta.java.week.two.PredicatesExercises.*;

class PredicatesExercisesTest {

    @Test
    void testPredicateOne() {

        assertTrue(predicateOne("abcde"));

        assertFalse(predicateOne("abcd"));
    }

    @Test
    void testPredicateTwo() {

        assertTrue(predicateTwo(""));

        assertFalse(predicateTwo("a"));
    }

    @Test
    void testPredicateThree() {

        assertTrue(PredicateThree(""));

        assertFalse(PredicateThree("a"));
    }

    @Test
    void testPredicateFour() {

        assertFalse(predicateFour("Hello"));
        assertFalse(predicateFour("HelloJ1"));
        assertFalse(predicateFour("Java1"));
        assertTrue(predicateFour("JavaOne"));
    }

    @Test
    void testPredicateFive() {

        assertFalse(predicateFive("Hello"));
        assertTrue(predicateFive("Hello J1!"));
        assertTrue(predicateFive("ERROR"));
        assertFalse(predicateFive("Error"));
    }
}