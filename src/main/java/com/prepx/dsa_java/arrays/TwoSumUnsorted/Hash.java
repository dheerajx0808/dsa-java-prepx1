package com.prepx.dsa_java.arrays.TwoSumUnsorted;

import java.util.HashMap;
import java.util.Map;

public class Hash {

    // https://leetcode.com/problems/two-sum/description/

    /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
       You may assume that each input would have exactly one solution, and you may not use the same element twice.
       You can return the answer in any order.
    * */

    public static void main(String args[]) {
        int arr[] = new int[]{2, 7, 11, 15};
        int target = 9;
        int output[] =  find2sum(arr, target);
        if(output.length > 0) {
            System.out.println("[" +output[0] + "," + output[1] + "]");
        } else {
            System.out.println("No such pairs of indices");
        }
    }


    // o(n) + o(n) => o(n)
    // {2, 7, 11, 15}
    // k = 9

    // x + y = k
    // k-x = y

    // 9-2 = 7
    public static int[] find2sum(int arr[], int k ) {
        //int outcome[] = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        // {2, 0} {7, 1} {11, 2} {15, 3}
       /* for(int i =0 ; i < arr.length; i++){
            indexMap.put(arr[i], i);
        }*/
       // 9-7 = 2 availabe in map
        for(int j =0 ; j < arr.length; j++){
            if(indexMap.containsKey(k-arr[j]) ) {
                return new int[]{j,indexMap.get(k-arr[j]) };
            } else {
                indexMap.put(arr[j], j);
            }
        }
        return new int[]{};
    }

}
