package com.assessment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SummativeTest {

    /* =========================================================
                       QUESTION 1
       ========================================================= */

    static Stream<Object[]> batchApiDispatcherLogicData() {

        return Stream.of(

                new Object[]{
                        List.of("ID1","ID2","ID3","ID4","ID5","ID6","ID7"),
                        List.of(
                                List.of("ID1","ID2","ID3","ID4","ID5"),
                                List.of("ID6","ID7")
                        )
                },

                new Object[]{
                        List.of("ID1","ID2","ID3","ID4","ID5"),
                        List.of(
                                List.of("ID1","ID2","ID3","ID4","ID5")
                        )
                },

                new Object[]{
                        List.of("ID1","ID2","ID3","ID4","ID5","ID6","ID7","ID8","ID9","ID10"),
                        List.of(
                                List.of("ID1","ID2","ID3","ID4","ID5"),
                                List.of("ID6","ID7","ID8","ID9","ID10")
                        )
                },

                new Object[]{
                        List.of("ID1","ID2","ID3"),
                        List.of(List.of("ID1","ID2","ID3"))
                },

                new Object[]{
                        List.of("ID1"),
                        List.of(List.of("ID1"))
                },

                new Object[]{
                        List.of(),
                        List.of()
                },

                new Object[]{
                        List.of("1","2","3","4","5","6"),
                        List.of(
                                List.of("1","2","3","4","5"),
                                List.of("6")
                        )
                },

                new Object[]{
                        List.of("ID10","ID5","ID3","ID8","ID1","ID7"),
                        List.of(
                                List.of("ID10","ID5","ID3","ID8","ID1"),
                                List.of("ID7")
                        )
                }

        );
    }

    @ParameterizedTest
    @MethodSource("batchApiDispatcherLogicData")
    void testBatchApiDispatcherLogic(List<String> inputIds,
                                     List<List<String>> expectedOutput){

        assertEquals(expectedOutput,
                Summative.batchApiDispatcher(inputIds));

    }


    @Test
    void testBatchApiDispatcherConstraintEnforced(){

        List<String> ids = new ArrayList<>();

        for(int i=1;i<50;i++){
            ids.add("ID"+i);
        }

        List<List<String>> result = Summative.batchApiDispatcher(ids);

        for(List<String> batch : result){
            assertTrue(batch.size() <= 5);
        }
    }


    @Test
    void testBatchApiDispatcherNoDataLoss(){

        List<String> ids = new ArrayList<>();

        for(int i=1;i<23;i++){
            ids.add("ID"+i);
        }

        List<List<String>> result = Summative.batchApiDispatcher(ids);

        List<String> flattened = new ArrayList<>();

        for(List<String> batch: result){
            flattened.addAll(batch);
        }

        assertEquals(ids, flattened);
    }


    @Test
    void testBatchApiDispatcherNoDuplicates(){

        List<String> ids = new ArrayList<>();

        for(int i=1;i<18;i++){
            ids.add("ID"+i);
        }

        List<List<String>> result = Summative.batchApiDispatcher(ids);

        List<String> flattened = new ArrayList<>();

        for(List<String> batch: result){
            flattened.addAll(batch);
        }

        assertEquals(flattened.size(),
                new HashSet<>(flattened).size());
    }


    @Test
    void testBatchApiDispatcherOrderPreserved(){

        List<String> ids = new ArrayList<>();

        for(int i=100;i<115;i++){
            ids.add("ID"+i);
        }

        List<List<String>> result = Summative.batchApiDispatcher(ids);

        List<String> flattened = new ArrayList<>();

        for(List<String> batch: result){
            flattened.addAll(batch);
        }

        assertEquals(ids, flattened);
    }


    @Test
    void testBatchApiDispatcherReturnsListOfLists(){

        List<List<String>> result =
                Summative.batchApiDispatcher(
                        List.of("ID1","ID2","ID3","ID4","ID5","ID6")
                );

        assertTrue(result instanceof List);

        for(List<String> batch : result){
            assertTrue(batch instanceof List);
        }
    }


    @Test
    void testBatchApiDispatcherEmptyReturnsList(){

        List<List<String>> result =
                Summative.batchApiDispatcher(List.of());

        assertEquals(List.of(), result);
    }


    @Test
    void testBatchApiDispatcherImmutability(){

        List<String> original =
                new ArrayList<>(List.of("A","B","C","D","E","F"));

        List<String> copy =
                new ArrayList<>(original);

        Summative.batchApiDispatcher(original);

        assertEquals(copy, original);
    }


    @Test
    void testBatchApiDispatcherLargeScale(){

        List<String> largeInput = new ArrayList<>();

        for(int i=0;i<10000;i++){
            largeInput.add("ID"+i);
        }

        List<List<String>> result =
                Summative.batchApiDispatcher(largeInput);

        assertEquals(2000,result.size());

        for(List<String> batch: result){
            assertEquals(5,batch.size());
        }

        List<String> flattened = new ArrayList<>();

        for(List<String> batch: result){
            flattened.addAll(batch);
        }

        assertEquals(largeInput, flattened);
    }


    /* =========================================================
                       QUESTION 2
       ========================================================= */

    static Stream<Object[]> winningStreakLogicData(){

        return Stream.of(

                new Object[]{List.of(),0},
                new Object[]{List.of("L"),0},
                new Object[]{List.of("W"),1},
                new Object[]{List.of("L","L","L","L","L"),0},
                new Object[]{List.of("W","W","W","W","W"),5},
                new Object[]{List.of("W","W","W","L","L","L"),3},
                new Object[]{List.of("L","L","L","W","W","W"),3},
                new Object[]{List.of("L","W","W","W","W","L"),4},
                new Object[]{List.of("W","W","L","W","W","W","L","W","W"),3}

        );
    }

    @ParameterizedTest
    @MethodSource("winningStreakLogicData")
    void testWinningStreakLogic(List<String> results,int expected){

        assertEquals(expected,
                Summative.winningStreak(results));
    }


    @Test
    void testWinningStreakLargeAllWins(){

        List<String> results = new ArrayList<>();

        for(int i=0;i<10000;i++){
            results.add("W");
        }

        assertEquals(10000,
                Summative.winningStreak(results));
    }


    @Test
    void testWinningStreakLargeAllLosses(){

        List<String> results = new ArrayList<>();

        for(int i=0;i<10000;i++){
            results.add("L");
        }

        assertEquals(0,
                Summative.winningStreak(results));
    }


    /* =========================================================
                       QUESTION 3
       ========================================================= */

    static Stream<Object[]> peakFinderLogicData(){

        return Stream.of(

                new Object[]{
                        List.of(1,3,7,1,2,6,3,2,1),
                        List.of(7,6)
                },

                new Object[]{
                        List.of(1,2,3,4,5),
                        List.of()
                },

                new Object[]{
                        List.of(9,7,5,3,1),
                        List.of()
                },

                new Object[]{
                        List.of(2,4,6,4,2),
                        List.of(6)
                }

        );
    }

    @ParameterizedTest
    @MethodSource("peakFinderLogicData")
    void testPeakFinderLogic(List<Integer> temps,
                             List<Integer> expected){

        assertEquals(expected,
                Summative.peakFinder(temps));
    }


    @Test
    void testPeakFinderLargeScaleZigzag(){

        List<Integer> temps = new ArrayList<>();

        for(int i=0;i<500;i++){
            temps.add(1);
            temps.add(10);
        }

        temps.add(1);

        List<Integer> result =
                Summative.peakFinder(temps);

        assertEquals(500,result.size());

        for(int val : result){
            assertEquals(10,val);
        }
    }


    /* =========================================================
                       QUESTION 4
       ========================================================= */

    @Test
    void testStageSummaryEmpty(){

        Map<String,Double> result =
                Summative.stageSummary(List.of());

        assertEquals(Map.of(), result);
    }


    @Test
    void testStageSummarySingle(){

        Map<String,Object> record = new HashMap<>();

        record.put("stage",2);
        record.put("duration_hours",2.5);

        Map<String,Double> result =
                Summative.stageSummary(List.of(record));

        assertEquals(2.5,result.get("Stage 2"));
    }


    /* =========================================================
                       QUESTION 5
       ========================================================= */

    static Stream<Object[]> drawTriangleData(){

        return Stream.of(

                new Object[]{1,List.of("*")},

                new Object[]{2,List.of(
                        " *",
                        "***"
                )},

                new Object[]{3,List.of(
                        "  *",
                        " * *",
                        "*****"
                )}
        );
    }

    @ParameterizedTest
    @MethodSource("drawTriangleData")
    void testDrawTriangleLogic(int height,
                               List<String> expected){

        assertEquals(expected,
                Summative.drawTriangle(height));
    }


    @Test
    void testDrawTriangleRowCount(){

        List<String> result =
                Summative.drawTriangle(10);

        assertEquals(10,result.size());
    }

}