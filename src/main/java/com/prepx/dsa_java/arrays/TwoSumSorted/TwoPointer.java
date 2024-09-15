package com.prepx.dsa_java.arrays.TwoSumSorted;

import java.util.HashMap;
import java.util.Map;

public class TwoPointer {
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

    /* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
       Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
       The tests are generated such that there is exactly one solution. You may not use the same element twice.
       Your solution must use only constant extra space.
    * */

    public static void main(String args[]) {
        int arr[] = new int[]{2, 4, 5, 7, 11, 15, 16, 17, 19, 24};
        int target = 9;
        int output[] =  find2sum(arr, target);
        if(output.length > 0) {
            System.out.println("[" +output[0] + "," + output[1] + "]");
        } else {
            System.out.println("No such pairs of indices");
        }
    }



    public static int[] find2sum(int arr[], int target ) {

        int leftp = 0;
        int rightp = arr.length - 1;

        while (leftp < rightp) { //base condition

            if (arr[leftp] + arr[rightp] == target) {

                return new int[]{leftp, rightp};

            } else if (arr[leftp] + arr[rightp] > target) {

                rightp--;
            } else {
                leftp++;
            }
        }
        return new int[]{};
    }

}
