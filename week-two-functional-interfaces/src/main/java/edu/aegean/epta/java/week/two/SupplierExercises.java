package edu.aegean.epta.java.week.two;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class SupplierExercises {


    /**
     * Write a lambda expression that returns a new StringBuilder
     * containing the string "abc".
     */
    public static String supplierOne() {

        // TODO: change here the code.
        Supplier<StringBuilder> sup = () -> new StringBuilder("abc");

        return sup.get().toString();
    }

    /**
     * Write a lambda expression that returns a new, empty StringBuilder.
     */
    public static String supplierTwo() {

        // TODO: change here the code.
        Supplier<StringBuilder> sup = StringBuilder::new;

        return sup.get().toString();
    }

    /**
     * Write a constructor reference that returns a new, empty StringBuilder.
     */
    public  static String  supplierThree() {
        // TODO: change here the code.
        Supplier<StringBuilder> sup = StringBuilder::new;;

        return sup.get().toString();
    }

    private void SupplierExercises() {}
}