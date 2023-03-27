package com.algo;
import com.algo.binarysearch.BinarySearch;
import com.algo.problems.NumberOfWaysToMakeAChange;
import com.algo.problems.TaskAssignment;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //int out = BinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},2);
        int out = NumberOfWaysToMakeAChange.numberOfWaysToMakeAChange(6, new int[]{1,5});
        System.out.println(out);
        TaskAssignment.assignTasks(3, new ArrayList<Integer>(Arrays.asList(1, 3, 5, 3, 1, 4)));
    }
}
