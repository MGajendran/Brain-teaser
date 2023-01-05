package com.datatype.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Question :
  Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. The function should find all triplets in
  the array that sum up to the target sum and return a two-dimensional array of
  all these triplets. The numbers in each triplet should be ordered in ascending
  order, and the triplets themselves should be ordered in ascending order with
  respect to the numbers they hold.

  If no three numbers sum up to the target sum, the function should return an
  empty array.

  Target sum : 0
  Sample Input:  = [12, 3, 1, 2, -6, 5, -8, 6]
  sample output : [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
 */
public class Triplets {

    public static List<Integer[]> processTriplets () {
        // taking the array and target from the question
        Integer[] arr = {12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;

        Arrays.sort(arr);
        List<Integer []> result = new ArrayList<>();

        for(int i=0; i<arr.length-2; i++) {
            int left = i+1, right = arr.length-1;
            while (left<right) {
                int currentValue = arr[0] + arr[left] + arr[right];
                if(currentValue == target) {
                    result.add( new Integer[]{ arr[0] , arr[left] , arr[right]});
                    left++;
                    right--;
                } else if(currentValue < target) {
                    left++;
                } else {
                    right--                                     ;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
       processTriplets();
    }

}
