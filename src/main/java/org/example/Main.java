package org.example;

public class Main
{
    public static final int NUM_LETTERS = 3;

    public static void printFirstNLetters(String[] arr, int numLetters)
    {
        for (String s : arr)
        {
            if (s.length() >= numLetters)
                System.out.printf("%s%n", s.substring(0, numLetters));
        }
    }

    public static String nthLettersChains(String[] arr, int n, int numLetters)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            if (arr[i].length() >= numLetters)
                result.append(arr[i].charAt(numLetters-1));
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        Person[] people = new Person[]
        {
            new Person("Enrico", "Drago", 25),
            new Person("Rossella", "Ferraù", 30),
            new Person("Francesco", "Barazzuti", 35)
        };

        String[] lastNames = new String[people.length];
        for (int i = 0; i < people.length; i++)
            lastNames[i] = people[i].getLastName();

        printFirstNLetters(lastNames, NUM_LETTERS);
        System.out.printf("%s%n", nthLettersChains(lastNames, 2, NUM_LETTERS));

        for (Person person : people)
            System.out.printf("%d%n", person.getAge());
    }
}
