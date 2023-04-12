package edu.aegean.epta.java.week.two.custom.builder;

import org.junit.jupiter.api.Test;

import static edu.aegean.epta.java.week.two.ConsumerExercises.consumerOne;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomBuilderTest {

    @Test
    void testConsumerOne() {

        Person person = CustomBuilder.of(Person.class).
                with(CustomBuilder::setFirstname, "vlasis").
                with(CustomBuilder::setLastname, "Barousis");

        assertEquals("vlasis", person.getFirstname());
        assertEquals("Barousis", person.getLastname());
    }
}

// https://medium.com/beingprofessional/think-functional-advanced-builder-pattern-using-lambda-284714b85ed5