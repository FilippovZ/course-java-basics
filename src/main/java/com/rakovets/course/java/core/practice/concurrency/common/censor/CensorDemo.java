package com.rakovets.course.java.core.practice.concurrency.common.censor;

import java.util.Scanner;

public class CensorDemo {
    public static void main(String[] args) {


        SearchAndMergeFilesThread searchAndMergeFilesThread = new SearchAndMergeFilesThread("src/test/resources/practice/concurrency/censor", "weather", "src/test/resources/practice/concurrency/mergedFiles.txt");
        searchAndMergeFilesThread.start();

        RemovingForbiddenWordsThread removeForbiddenWords = new RemovingForbiddenWordsThread("src/test/resources/practice/concurrency/forbiddenWords.txt", "src/test/resources/practice/concurrency/mergedFiles.txt");
        removeForbiddenWords.start();



    }
}