package com.assessment;

import java.util.*;

/**
 * This class contains all function signatures required for the Summative 004 assessment.
 * Students must implement the logic in each method.
 */
public class Summative {


    /**
     * Splits a list of user IDs into batches of at most 5.
     *
     * @param userIds List of user ID strings to dispatch
     * @return A nested List of Lists, each inner list contains at most 5 IDs
     */
    public static List<List<String>> batchApiDispatcher(List<String> userIds) {
        List<List<String>> listOfBatch = new ArrayList<>(); 
        List<String> batch = new ArrayList<>();
        for (int i = 0; i < userIds.size(); i++) {
            System.out.println(userIds.get(i));
            if (i % 5 == 0 && i != 0) {
                listOfBatch.add(new ArrayList<>(batch));
                batch.clear();
            }
            batch.add(userIds.get(i));
            System.out.println("List =" + listOfBatch);
            System.out.println("batch =" + batch);
        } 

        if (!batch.isEmpty()) listOfBatch.add(batch);
        return listOfBatch;
    }

    /**
     * Finds the longest consecutive winning streak.
     *
     * @param streak List of "W" (win) and "L" (loss) strings
     * @return Maximum number of consecutive wins
     */
    public static int winningStreak(List<String> streak) {
        // TODO: Implement this method
        String stringOFStreak = "";
        String[] listOfWins;
        int longest = 0;
        for (String outcome: streak) stringOFStreak += outcome;
        listOfWins = stringOFStreak.split("L");
        for (String wins: listOfWins) {
            if (wins.length() > longest) longest = wins.length();
        }
        return longest;
        
    }

    /**
     * Finds local peak temperatures in a list.
     *
     * @param temps List of temperature integers
     * @return List of temperatures that are greater than the ones immediately before and after
     */
    public static List<Integer> peakFinder(List<Integer> temps) {
        // TODO: Implement this method
        List<Integer> peaks = new ArrayList<>();
        if (temps == null || temps.isEmpty()) return new ArrayList<>();
        for (int i = 1; i < temps.size() - 1; i++ ) {
            if (temps.get(i) > temps.get(i - 1) && temps.get(i) > temps.get(i + 1)) {
                peaks.add(temps.get(i));
            }
        }
        return peaks;
    }

    /**
     * Summarizes total hours per load shedding stage.
     *
     * @param records List of Maps representing incidents with keys "stage" and "duration_hours"
     * @return Map of stage labels ("Stage 1") to total duration (rounded to 2 decimal places)
     */
    public static Map<String, Double> stageSummary(List<Map<String, Object>> records) {
        // TODO: Implement this method
        return new HashMap<>();
    }

    /**
     * Generates a hollow isosceles triangle as a list of strings.
     *
     * @param height Integer height of the triangle
     * @return List of strings, each representing a row of the triangle
     */
    public static List<String> drawTriangle(int height) {
        // TODO: Implement this method
        return new ArrayList<>();
    }
}