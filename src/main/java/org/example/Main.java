package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String puzzleInputPath = "src/main/resources/input1.1.txt";
    private static final File inputFile = new File(puzzleInputPath);
    private static final String testPath = "src/main/resources/test.txt";
    private static final File testFile = new File(testPath);
    private static Scanner scanner;

    public static void main(String[] args) {
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        day1();
    }

    private static void day1() {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split("\\s+");
            arr1.add(data[0]);
            arr2.add(data[1]);
        }

        Solution1 solution = new Solution1(arr1, arr2);
        System.out.println("Problem 1: " + solution.findDistanceSum());
        System.out.println("Problem 2: " + solution.calculateSimilarityScore());
    }
}