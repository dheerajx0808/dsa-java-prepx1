package com.prepx.dsa_java.arrays.TwoSum;

public class Brute {

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

    // {0, 1}  {1, 0}

    public static int[] find2sum(int arr[], int k ) {
        //int outcome[] = new int[2];
        for(int i =0 ; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++) {

                if(arr[i] + arr[j] == k) {
                    //outcome[0] = i;
                    //outcome[1] = j;
                    //return outcome;
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};

       }
}
