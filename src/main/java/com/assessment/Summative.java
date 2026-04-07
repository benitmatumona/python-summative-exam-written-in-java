package com.assessment;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Summative Assessment
 *
 * Students must implement the following methods.
 * Each method corresponds to a numbered question.
 */
public class Summative {

    // ============================
    // Question 1
    // ============================

    /**
     * Reverses the order of elements in a list.
     *
     * @param items A list containing elements of any type.
     * @return A new list containing the same elements but in reverse order.
     */
    public static <T> List<T> reverseList(List<T> items) {
        throw new UnsupportedOperationException("Question 1 not implemented");
    }


    // ============================
    // Question 2
    // ============================

    /**
     * Calculates the sum of all even numbers in a list.
     *
     * @param numbers A list of integers.
     * @return The sum of all even numbers found in the list.
     */
    public static int sumEvenNumbers(List<Integer> numbers) {
        throw new UnsupportedOperationException("Question 2 not implemented");
    }


    // ============================
    // Question 3
    // ============================

    /**
     * Finds the skills that are common to all applicants.
     *
     * @param applicants A map where the key is an applicant name
     *                   and the value is a list of that applicant's skills.
     * @return A set containing the skills shared by every applicant.
     */
    public static Set<String> findCommonSkills(Map<String, List<String>> applicants) {
        throw new UnsupportedOperationException("Question 3 not implemented");
    }


    // ============================
    // Question 4
    // ============================

    /**
     * Computes the total load shedding duration per stage.
     *
     * @param records A list of maps where each map represents a load shedding record.
     *                Each record contains keys such as "stage" and "duration_hours".
     *
     * @return A map where:
     *         - the key is "Stage X"
     *         - the value is the total duration in hours (rounded to two decimal places)
     */
    public static Map<String, Double> stageSummary(List<Map<String, Object>> records) {
        throw new UnsupportedOperationException("Question 4 not implemented");
    }


    // ============================
    // Question 5
    // ============================

    /**
     * Computes the sum of numbers within a sliding window.
     *
     * @param numbers A list of integers.
     * @param windowSize The size of the sliding window.
     *
     * @return A list where each element represents the sum of a window
     *         of consecutive elements.
     */
    public static List<Integer> slidingWindowSum(List<Integer> numbers, int windowSize) {
        throw new UnsupportedOperationException("Question 5 not implemented");
    }
}