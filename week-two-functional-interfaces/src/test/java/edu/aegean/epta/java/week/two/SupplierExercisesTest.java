package edu.aegean.epta.java.week.two;

import org.junit.jupiter.api.Test;
import static edu.aegean.epta.java.week.two.SupplierExercises.*;

import static org.junit.jupiter.api.Assertions.*;

class SupplierExercisesTest {

    @Test
    void supplierOneTest() {
        assertEquals("abc", supplierOne());
    }

    @Test
    void supplierTwoTest() {
        assertEquals("", supplierTwo());
    }

    @Test
    void supplierThreeTest() {
        assertEquals("", supplierThree());
    }
}