package edu.aegean.epta.java.recipes.week.four;

import java.util.Comparator;
import java.util.function.IntBinaryOperator;

public final class ComparatorsExercises {

    /**
     * Write a Comparator that compare instances of String using their length.
     * For instance FOUR (4 letters) is greater than TWO (three letters)
     * HINT: Check the static factory methods of the Comparator interface. Remember how you
     * implemented functions in the previous exercises. Write it using a method reference.
     */
    public static int comparator01(String wordA, String wordB) {

        // TODO: change here the code.
        Comparator<String> compareByLength = Comparator.comparingInt(String::length);

        return compareByLength.compare(wordA, wordB);
    }

    /**
     * Write a Comparator that compare instances of String using their length.
     * If the lengths are the same, then use the alphabetical order.
     * HINT: Use the previous comparator and check the default methods of the
     * Comparator interface. Check also the factory methods of the Comparator interface, and remember
     * that String is comparable.
     */
    public static int  comparator02(String wordA, String wordB) {

        // TODO: change here the code.
        Comparator<String> compareByLengthThenAlphabetical = Comparator.comparingInt(String::length)
                .thenComparing(String::compareTo);

        return compareByLengthThenAlphabetical.compare(wordA, wordB);
    }


    /**
     * Write a Comparator that compares instances of Person using their lastName.
     * HINT: Check the static factory methods of the Comparator interface. Remember
     * how you implemented functions in the previous exercises. Write it using
     * a method reference.
     */
    public static int comparator03(Person personA, Person personB) {

        // TODO: change here the code.
        Comparator<Person> comparebyLastName = Comparator.comparing(Person::getLastName);

        return comparebyLastName.compare(personA, personB);
    }

    /**
     * Write a Comparator that compares instances of Person using their
     * lastName, and if their last name is the same, uses their first name.
     * HINT: Use the previous comparator and check the default methods of the Comparator interface.
     */
    public static int comparator04(Person personA, Person personB) {

        // TODO: change here the code.
        Comparator<Person> comparebyLastNameThenFirstName = Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName);


        return  comparebyLastNameThenFirstName.compare(personA, personB);

    }

    /**
     * Write a Comparator that compares the people in the order reversed from
     * the one you wrote in the comparator04() exercise. That is, the person
     * with the greater last name should be ordered first. If two persons have
     * the same last name, the one with the greater first name should be
     * ordered first.
     * HINT: Use the previous comparator and check the default methods of the Comparator interface.
     */
    public static int comparator05(Person personA, Person personB) {

        // TODO: change here the code.
        Comparator<Person> comparebyLastNameThenFirstNameReversed = Comparator
                .comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .reversed();

        return comparebyLastNameThenFirstNameReversed.compare(personA, personB);

    }

    /**
     * Write a Comparator that compares the people in the same order than the
     * one you wrote in comparator04(), but that supports null values. The null
     * values should be considered greater than any non-null values.
     * HINT:  Use the previous comparator and check the static methods of the Comparator interface.
     */
    public static int comparator06(Person personA, Person personB) {


        // TODO: change here the code.
        Comparator<Person> comparebyLastNameThenFirstNameWithNull = Comparator
                .nullsLast(Comparator
                        .comparing(Person::getLastName)
                        .thenComparing(Person::getFirstName)
                );

        return comparebyLastNameThenFirstNameWithNull.compare(personA, personB);

    }

    /**
     * Write a Comparator that compares two people by age.
     * Try to write the comparator so as to avoid boxing of primitives.
     * HINT: Look for static methods on the Comparator interface that have primitive specializations.
     */
    public static int comparator07(Person personA, Person personB) {

        // TODO: change here the code.
        Comparator<Person> comparebyAge = Comparator.comparingInt(Person::getAge);
        return comparebyAge.compare(personA, personB);
    }

    /**
     * Write a lambda expression that compares two int values and returns an
     * int result that is less than, equal to, or greater than zero, like
     * a comparator. Watch out for overflow. The Comparator interface takes
     * two objects, but in this case we are comparing int primitives, so the
     * functional interface we use is IntBinaryOperator.
     * HINT:  Use a ternary operator (cond ? result1 : result2) instead of subtraction.
     */
    public static int  comparator08(int valueA, int valueB) {

        // TODO: change here the code.
        IntBinaryOperator intCompare = (v1, v2) -> (v1 == v2) ? 0 : (v1 > v2)? 1 : -1;

        return intCompare.applyAsInt(valueA, valueB);
    }

    /**
     * Write a method reference that compares two int values and returns an
     * int result that is less than, equal to, or greater than zero, like
     * a comparator.
     * HINT:  Use a method reference to a static method on the Integer class.
     */
    public static int comparator09(int valueA, int valueB) {

        // TODO: change here the code.
        IntBinaryOperator intCompare = Integer::compare;

        return intCompare.applyAsInt(valueA, valueB);
    }


    interface DoubleToIntBiFunction {
        int applyAsInt(double a, double b);
    }

    /**
     * Write a method reference that compares two double values and returns an
     * int result that is less than, equal to, or greater than zero, like
     * a comparator. There functional interface that takes two doubles and returns
     * an int, so we define one here. Comparing double values introduces
     * special cases such NaN. Consider all NaN values to be equal to each other
     * and greater than any non-NaN value.
     * HINT: Use a method reference to a static method on the Double class.
     */
    public static double comparator10(double valueA, double valueB) {

        // TODO: change here the code.
        DoubleToIntBiFunction doubleCompare = Double::compare;

        return doubleCompare.applyAsInt(valueA, valueB);

    }

}
