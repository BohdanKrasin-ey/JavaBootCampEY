package org.example.exercises.exerciseNo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberInputStatistics {
    private static final ArrayList <Integer> numbers= new ArrayList<>();

    public static void main(String[] args) {
        readInputData();
        calculateDeciles();
        calculateStatistics();
        System.out.println(numbers);
    }

    private static void readInputData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            System.out.print("Enter a number between 1 and 1000,to exit print 0: ");
            try {
                n = Integer.parseInt(br.readLine());
                if (n < 1 || n > 1000) {
                    System.out.println("Invalid input. Enter a number between 1 and 1000.");
                }
                else {
                numbers.add(n);}
            } catch (NumberFormatException | IOException e) {
                System.out.println("Invalid input. Enter a number between 1 and 1000.");
                n = 0;
            }
        } while (n!=0);
    }

    public static void calculateDeciles() {
        Collections.sort(numbers);
        int n = numbers.size();
        double d3 = numbers.get((int) Math.ceil(n * 0.3) - 1);
        double d6 = numbers.get((int) Math.ceil(n * 0.6) - 1);
        System.out.println("3 decile: " + d3);
        System.out.println("6 decile: " + d6);
    }

    public static void calculateStatistics() {
        int count3 = 0;
        int count6 = 0;
        for (int num : numbers) {
            if (num >= 1 && num <= 300) {
                count3++;
            } else if (num >= 301 && num <= 600) {
                count6++;
            }
        }
        System.out.println("Numbers in 3 decile: " + count3);
        System.out.println("Numbers in 6 decile: " + count6);
    }
}
