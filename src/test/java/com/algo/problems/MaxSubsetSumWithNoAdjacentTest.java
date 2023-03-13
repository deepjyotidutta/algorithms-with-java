package com.algo.problems;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxSubsetSumWithNoAdjacentTest {

    @Test
    public void testGetMaxSubsetSmWithNoAdjacent() {
        // Test with valid input arrays
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(9, MaxSubsetSumWithNoAdjacent.getMaxSubsetSmWithNoAdjacent(array1));

        int[] array2 = {5, 1, 1, 5};
        assertEquals(10, MaxSubsetSumWithNoAdjacent.getMaxSubsetSmWithNoAdjacent(array2));

        // int[] array3 = {0, -1, 3, 100, -70};
        // assertEquals(103, MaxSubsetSumWithNoAdjacent.getMaxSubsetSmWithNoAdjacent(array3));

        
        // Test with empty array
        int[] array4 = {};
        assertEquals(0, MaxSubsetSumWithNoAdjacent.getMaxSubsetSmWithNoAdjacent(array4));
    }

    
}
