package com.algo;
import com.algo.binarysearch.BinarySearch;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int out = BinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},2);
        System.out.println(out);
    }
}
