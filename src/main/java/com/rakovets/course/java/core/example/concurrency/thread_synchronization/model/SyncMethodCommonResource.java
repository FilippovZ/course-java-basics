package com.rakovets.course.java.core.example.concurrency.thread_synchronization.model;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class SyncMethodCommonResource {
    private int x;

    synchronized void increment() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        for (int i = 1; i < 5; i++) {
            StandardOutputUtil.printlnWithTimeAndThread(x, randomColor);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
