package com.rakovets.course.java.core.practice.concurrency.common.masterAndWorker;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class ThreadWorker extends Thread {
    private List<Integer> listOfNumbers;
    private boolean isActive;

    public ThreadWorker(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
        this.isActive = true;
    }

    @Override
    public void run() {
        int counter = 0;
        while (isActive) {
            if (counter < listOfNumbers.size() && listOfNumbers.get(counter) != -1) {
                try (FileWriter writer = new FileWriter("src/test/resources/practice/concurrency/masterWorker/worker.txt", true)) {
                    Thread.sleep(listOfNumbers.get(counter) * 1000);
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    writer.write(timestamp + " - I slept " + listOfNumbers.get(counter) + " seconds\n");
                    counter++;
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            } else if (counter < listOfNumbers.size() && listOfNumbers.get(counter) == -1) {
                isActive = false;
            }
        }
    }
}
