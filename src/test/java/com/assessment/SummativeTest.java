package com.assessment;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SummativeTest {

    // ============================
    // Test Question 1
    // ============================

    @Test
    void testReverseList() {

        List<Integer> input = Arrays.asList(1,2,3,4,5);
        List<Integer> expected = Arrays.asList(5,4,3,2,1);

        assertEquals(expected, Summative.reverseList(input));
    }


    // ============================
    // Test Question 2
    // ============================

    @Test
    void testSumEvenNumbers() {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        assertEquals(12, Summative.sumEvenNumbers(numbers));
    }


    // ============================
    // Test Question 3
    // ============================

    @Test
    void testFindCommonSkills() {

        Map<String, List<String>> applicants = new HashMap<>();

        applicants.put("Lerato", Arrays.asList("Python","SQL","Git","Docker"));
        applicants.put("Thabo", Arrays.asList("Python","SQL","Java","Git"));
        applicants.put("Nandi", Arrays.asList("Python","SQL","Git","React"));

        Set<String> expected = new HashSet<>(Arrays.asList("Python","SQL","Git"));

        assertEquals(expected, Summative.findCommonSkills(applicants));
    }


    // ============================
    // Test Question 4
    // ============================

    @Test
    void testStageSummary() {

        List<Map<String,Object>> records = new ArrayList<>();

        Map<String,Object> r1 = new HashMap<>();
        r1.put("stage",2);
        r1.put("duration_hours",2.5);

        Map<String,Object> r2 = new HashMap<>();
        r2.put("stage",4);
        r2.put("duration_hours",4.0);

        records.add(r1);
        records.add(r2);

        Map<String,Double> result = Summative.stageSummary(records);

        assertEquals(2.5, result.get("Stage 2"));
        assertEquals(4.0, result.get("Stage 4"));
    }


    // ============================
    // Test Question 5
    // ============================

    @Test
    void testSlidingWindowSum() {

        List<Integer> numbers = Arrays.asList(2,4,6,8,10);
        List<Integer> expected = Arrays.asList(12,18,24);

        assertEquals(expected, Summative.slidingWindowSum(numbers,3));
    }

}