package com.prepx.dsa_java.arrays.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Hash {

    // https://leetcode.com/problems/majority-element/description/

    /* Given an array nums of size n, return the majority element.
       The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    * */

    public static void main(String args[]) {
        int arr[] = new int[]{2,2,1,1,1,2,2};

        int majority =  findMajority(arr);
        if(majority> 0) {
            System.out.println("Majority element :" + majority);
        } else {
            System.out.println("No such Majority element exists");
        }
    }

    // {0, 1}  {1, 0}

    public static int findMajority(int arr[]) {
        //int outcome[] = new int[2];
        Map<Integer, Integer> frequencyMap =  new HashMap<>();
        for(int i =0 ; i < arr.length; i++){
            if(frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) +1);
            } else {
                frequencyMap.put(arr[i], 1 );
            }
        }
        for(int key : frequencyMap.keySet()){
            if(frequencyMap.get(key) >  arr.length/2) {
               return key;
            }
        }

        return -1;
    }
}
