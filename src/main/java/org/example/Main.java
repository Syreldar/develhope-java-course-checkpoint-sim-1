package org.example;

public class Main
{
    public static final int NUM_LETTERS = 3;

    public static final int CONCAT_ELEMENTS_NUM = 2;
    public static final int CONCAT_CHAR_ID = 3;

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
        System.out.printf("%s%n", nthLettersChains(lastNames, CONCAT_ELEMENTS_NUM, CONCAT_CHAR_ID));

        for (Person person : people)
            System.out.printf("%d%n", person.getAge());
    }

    public static void printFirstNLetters(String[] arr, int numLetters)
    {
        for (String s : arr)
        {
            if (s.length() >= numLetters)
                System.out.printf("%s%n", s.substring(0, numLetters));
        }
    }

    public static String nthLettersChains(String[] arr, int n, int charIdx)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            if (arr[i].length() > charIdx-1)
                result.append(arr[i].charAt(charIdx-1));
        }

        return result.toString();
    }
}
