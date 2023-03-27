package com.algo.problems;

import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class TaskAssignment {
    
    public static List<ArrayList<Integer>> assignTasks(int workers,ArrayList<Integer> tasks){
        // 1 1 2 2 3 4 4 4 5 5
        ArrayList<Integer> sortedCopy = new ArrayList<Integer>(tasks);
        Collections.sort(sortedCopy);
        List<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();
        System.out.println(tasks);
        System.out.println(sortedCopy);

        for(int i=0;i<workers;i++){
            ArrayList<Integer> ts=new ArrayList<>();
            ts.add(tasks.indexOf(sortedCopy.get(i)));
           tasks.set(tasks.indexOf(sortedCopy.get(i)),-1) ;
            ts.add(tasks.indexOf(sortedCopy.get(tasks.size() -1 -i)));
            tasks.set(tasks.indexOf(sortedCopy.get(tasks.size() -1 -i)),-1) ;

            out.add(ts);
        }
        System.out.println(out);
        return out;
    }
}
