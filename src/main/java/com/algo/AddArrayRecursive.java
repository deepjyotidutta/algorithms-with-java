package com.algo;

import java.util.*;

public class AddArrayRecursive {

   

    //write  a recursive function that takes an array of integers and returns the sum of all the integers
    public static int add(int[] arr){
        return add(arr,0);
    }

    public static int add(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return arr[idx] + add(arr,idx+1);
    }

    public static int findMax(int[] arr){
        return max(arr,0);
    }
    public static int max(int[] arr,int idx){
        if(idx==2){
           
            return arr[0] > arr[1]?arr[0]:arr[1];
        }
        submax =  max(arr,idx+1);
    }

    public static void main(String[] args){
        int out = add(new int[]{1,2,3,10});
        System.out.println(out);
    }
    
}
