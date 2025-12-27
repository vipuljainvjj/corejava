package com.vipul;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class shutdownhook {

    /**
     * @param args
     *
     * Program Output
     *
     * Main thread started
     * Main thread ended
     * Shut-Down-Hook-Thread
     * Run when application is closing to clean resources
     */
    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Run when application is closing to clean resources");
        };

        // Register a Thread that run when main method is completed
        Runtime.getRuntime().addShutdownHook(new Thread(runnable, "Shut-Down-Hook-Thread"));

        System.out.println("Main thread started");

        IntStream.range(0,5).map(i -> i * 1000).forEach(i -> {
            try {
                Thread.sleep(i);
            } catch (InterruptedException exp) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("Main thread ended");
    }
}
