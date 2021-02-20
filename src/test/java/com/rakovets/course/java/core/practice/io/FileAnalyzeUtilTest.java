package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileAnalyzeUtilTest {

    @Test
    void getListOfStrings() {
        List<String> expected = new LinkedList<>();
        expected.add("hello world");
        expected.add("hello my friend");

        List<String> actual = FileAnalyzeUtil.getListOfStrings("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/list-of-strings.txt");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getListOfWordsWithFirstVowel() {
        List<String> expected = new LinkedList<>();
        expected.add("apple");
        expected.add("Enum");

        List<String> actual = FileAnalyzeUtil.getListOfWordsWithFirstVowel("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/list-of-words-with-first-vowel");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getListOfWordsWithStartAndEndChar() {
        List<String> expected = new LinkedList<>();
        expected.add("dog");
        expected.add("everybody");

        List<String> actual = FileAnalyzeUtil.getListOfWordsWithStartAndEndChar("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/list-words-with-start-end-char");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxConsistencyOfNumbers() {
        List<String> expected = new LinkedList<>();
        expected.add("1 2 3");
        expected.add("67 68 69");

        List<String> actual = FileAnalyzeUtil.getMaxConsistencyOfNumbers("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/list-max-consistency.txt");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNumbersOfChars() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('d', 2);
        expected.put('u', 1);
        expected.put('f', 2);
        expected.put('j', 5);

        Map<Character, Integer> actual = FileAnalyzeUtil.getNumbersOfChars("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/numbers-of-chars.txt");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNumberOfWords() {
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("dog", 1);
        expected.put("java", 2);
        expected.put("cat", 3);

        Map<String, Integer> actual = FileAnalyzeUtil.getNumberOfWords("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/number-of-words.txt");

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void getSortNumbers() {
        String expected = "";
        try (BufferedReader br = new BufferedReader(new FileReader("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/sort-numbers_.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                expected += s;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        FileAnalyzeUtil.getSortNumbers("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/sort-numbers.txt");
        String actual = "[0, 9, 23, 24]";

        Assertions.assertEquals(expected, actual);
    }
}
