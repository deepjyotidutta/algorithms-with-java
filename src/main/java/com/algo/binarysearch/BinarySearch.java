package com.algo.binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] arr,int key){
        System.out.println("Start Binary Search");
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            System.out.println(start+" "+end+" "+mid);
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    
}
