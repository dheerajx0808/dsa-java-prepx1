package com.prepx.dsa_java.arrays.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MooreCountingAlgo {


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
        int majority = arr[0];
       int count = 1;
        for(int i =1 ; i < arr.length; i++){
            if(count == 0) {
                majority = arr[i];
                count = 1;
            }else if(majority == arr[i]) {
               count++;
           } else if (majority != arr[i]) {
               count--;
           }
        }
        System.out.println("majority :"+ majority);
        int majorityCount =0;
        for(int j =0 ; j < arr.length; j++){

            if(arr[j] == majority){
                majorityCount++;
            }
            if(majorityCount > arr.length/2) {
                return majority;
            }
        }
        return -1;
    }
}
