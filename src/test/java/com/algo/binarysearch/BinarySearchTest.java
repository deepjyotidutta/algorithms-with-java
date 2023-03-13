package com.algo.binarysearch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    //write test method using  jupiter
    @Test
    public void testBinarySearch(){
        int out = BinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},2);
        assertEquals(1,out);
    }

    @Test
    public void testBinarySearch2(){
        int out = BinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},11);
        assertEquals(-1,out);
    }

    @Test
    public void testBinarySearch3(){
        int out = BinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},1);
        assertEquals(0,out);
    }

    @Test
    public void testBinarySearch4(){
        int out = BinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},10);
        assertEquals(9,out);
    }

    @Test
    public void testBinarySearch5(){
        int out = BinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},5);
        assertEquals(4,out);
    }
    
}
