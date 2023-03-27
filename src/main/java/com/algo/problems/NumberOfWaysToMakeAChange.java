package com.algo.problems;

import java.util.Arrays;

public class NumberOfWaysToMakeAChange {

    public static int numberOfWaysToMakeAChange(int n,int[] denoms) {

        //6 [1 2 3]
        // ways[amount]+=ways[amount-denom]
        int[] ways=new int[n+1];
        Arrays.fill(ways,0);
        ways[0]=1;
        System.out.println(Arrays.toString(ways));

        for (int d : denoms){
            for(int amount=1;amount<ways.length;amount++){
                if(d<=amount){
                    ways[amount]+=ways[amount-d];
                }
            }
        }

        System.out.println(Arrays.toString(ways));

        return ways[n];

    }

}