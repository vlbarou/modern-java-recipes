package edu.aegean.epta.java.recipes.week.four;

import edu.aegean.epta.java.recipes.week.four.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static edu.aegean.epta.java.recipes.week.four.ComparatorsExercises.*;
class ComparatorsExercisesTest {

    final Person michael = new Person("Michael", "Jackson", 51);
    final Person rod = new Person("Rod", "Stewart", 71);
    final Person paul = new Person("Paul", "McCartney", 74);
    final Person mick = new Person("Mick", "Jagger", 73);
    final Person jermaine = new Person("Jermaine", "Jackson", 61);


    @Test
    void test_comparator01() {

        assertTrue(comparator01("FOUR", "TWO") > 0);
        assertTrue(comparator01("ONE", "SEVEN") < 0);
        assertTrue(comparator01("ONE", "TWO") == 0);
    }

    @Test
    void test_comparator02() {

        assertTrue(comparator02("FOUR", "TWO") > 0);
        assertTrue(comparator02("ONE", "SEVEN") < 0);
        assertTrue(comparator02("ONE", "TWO") < 0);
        assertTrue(comparator02("FOUR", "FIVE") > 0);
        assertTrue(comparator02("EIGHT", "EIGHT") == 0);
    }

    @Test
    void test_comparator03() {

        assertTrue(comparator03(michael, rod) < 0);
        assertTrue(comparator03(paul, paul) == 0);
        assertTrue(comparator03(michael, jermaine) == 0);
    }

    @Test
    void test_comparator04() {

        assertTrue(comparator04(michael, rod) < 0);
        assertTrue(comparator04(paul, paul) == 0);
        assertTrue(comparator04(michael, jermaine) > 0);
    }

    @Test
    void test_comparator05() {

        assertFalse(comparator05(michael, rod) < 0);
        assertTrue(comparator05(paul, paul) == 0);
        assertFalse(comparator05(michael, jermaine) > 0);
    }

    @Test
    void test_comparator06() {

        assertTrue(comparator06(michael, rod) < 0);
        assertTrue(comparator06(paul, paul) == 0);
        assertTrue(comparator06(michael, jermaine) > 0);
        assertTrue(comparator06(mick, null) < 0);
        assertTrue(comparator06(null, mick) > 0);
    }

    @Test
    void test_comparator07() {

        assertTrue(comparator07(michael, rod) < 0);
        assertTrue(comparator07(paul, paul) == 0);
        assertTrue(comparator07(mick, jermaine) > 0);
    }

    @Test
    public void test_comparator08() {

        assertTrue(comparator08(0, 1) < 0);
        assertTrue(comparator08(1, 1) == 0);
        assertTrue(comparator08(2, 1) > 0);
        assertTrue(comparator08(Integer.MIN_VALUE, Integer.MAX_VALUE) < 0);
        assertTrue(comparator08(Integer.MAX_VALUE, Integer.MIN_VALUE) > 0);
    }

    @Test
    public void test_comparator09() {

        assertTrue(comparator09(0, 1) < 0);
        assertTrue(comparator09(1, 1) == 0);
        assertTrue(comparator09(2, 1) > 0);
        assertTrue(comparator09(Integer.MIN_VALUE, Integer.MAX_VALUE) < 0);
        assertTrue(comparator09(Integer.MAX_VALUE, Integer.MIN_VALUE) > 0);
    }

    @Test
    public void test_comparator10() {

        assertTrue(comparator10(0.0, 1.0) < 0);
        assertTrue(comparator10(1.0, 1.0) == 0);
        assertTrue(comparator10(2.0, 1.0) > 0);
        assertTrue(comparator10(Double.NaN, Double.NaN) == 0);
        assertTrue(comparator10(Double.NaN, 0.0) > 0);
        assertTrue(comparator10(0.0, Double.NaN) < 0);
    }
}