package org.example.exercises.mavenExercise;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Solution {
    private static final Logger log = LogManager.getLogger(Solution.class);
    public static void main(String[] args) {

        log.info("Starting application");
        log.info("Starting sorting data");
        sort();
        log.info("Closing application");

    }
    public static void sort() {
    }
}
