# Lab 1: Week One Basics
You need to work on maven module `Week-one-basics`.

## Description
In the first week, we will cover the basics of lambdas expressions and method references and
follow with the new features of interfaces such as default methods and static methods. It also
defines the term functional interfaces and explains how it is key to undestand lambda expressions.

## Exercise One
In java class `edu.aegean.epta.java.recipes.week.one.PalindromeExerciseOne` you have to refactor the method `isPalindrome(..)`
using lambdas to check all values that are palindromes. The junit tests must be passed.

```java
    public static boolean isAllPalindrome(List<String> values) {

        AtomicBoolean isPalindrome = new AtomicBoolean(true);

        //HINT: ser forEach method from List interface andd use a Consumer functional interface.
        for (String value : values) {
            if (isPalindrome(value)) {
                System.out.println("String: " + value + " is Palindrome");
            } else {
                System.out.println("String: '<" + value + ">' is NOT Palindrome");
                isPalindrome.set(false);
            }
        }

        return isPalindrome.get();
    }

```

## Exercise Two
In java class `edu.aegean.epta.java.recipes.week.one.PalindromeExerciseOne` you have to refactor the functiona interface `(..)`
to check all values that are palindromes. The junit tests must be passed. You need to edit the following method:

```java
    @FunctionalInterface
    interface PalindromeCheckerInterface {
        boolean isPalindrome();

        static boolean checkPalindrome(String word) {


            //HINT: Modify the previous implementation.

            return false;
        }
    }
```

## Exercise Three: Questions related to java functional and lamdbas. 
Please find below some questions that you need to answer

### Question 1: What is a functional interface?
Please provide your answer below ...

### Question 2: Is it possible to define our own Functional Interface? What is `@FunctionalInterface`? What are the rules to define a Functional Interface?
Please provide your answer here ...

### Question 3: Name ten functional interfaces in the standard library
Please provide your answer here ...

### Question 4: Name ten functional interfaces in the standard library
Please provide your answer here ...

### Question 5: What Is the Difference Between a Normal and Functional Interface in Java?
Please provide your answer here ...