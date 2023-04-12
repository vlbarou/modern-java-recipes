package edu.aegean.epta.java.week.two.custom.builder;


public class CustomBuilder {


    private static Person person;
    public static Person of(Class<Person> c) {
        try {
            person = c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return person;
    }



    public static Person setFirstname(String name) {
        person.setFirstname(name);
        return person;
    }

    public static Person setLastname(String name) {
        person.setLastname(name);
        return person;
    }
}
