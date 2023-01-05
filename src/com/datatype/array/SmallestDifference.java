package com.datatype.array;

import java.util.Arrays;

public class SmallestDifference {

    /*
      Write a function that takes in two non-empty arrays of integers, finds the
      pair of numbers (one from each array) whose absolute difference is closest to
      zero, and returns an array containing these two numbers, with the number from
      the first array in the first position.

      Note that the absolute difference of two integers is the distance between
      them on the real number line. For example, the absolute difference of -5 and 5
      is 10, and the absolute difference of -5 and -4 is 1.

      You can assume that there will only be one pair of numbers with the smallest
      difference.

       Sample input
        arr1 = [-1, 5, 10, 20, 28, 3];
        arr2 = [26, 134, 135, 15, 17];
        Sample output = [28,26]
     */

    public static void main(String[] args) {
        // taking the inputs from question
        int [] arr1 = {-1, 5, 10, 20, 28, 3}, arr2 = {26, 134, 135, 15, 17};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int pointer1 = 0, pointer2 = 0;
        int smallDifference = Integer.MAX_VALUE;
        int result[] = {arr1[0], arr2[0]}; // because the output is a pair which is nearest to zero, so the least number in both array will be least

        while(pointer1 < arr1.length && pointer2 < arr2.length) {
            int curDiff = Math.abs(arr1[pointer1] - arr2[pointer2]);
            if(curDiff < smallDifference) {
                smallDifference = curDiff;
                result[0] = arr1[pointer1];
                result[1] = arr2[pointer2];
            }
            if(arr1[pointer1] < arr2[pointer2]) {
                pointer1 ++;
            } else if ( arr2[pointer2] < arr1[pointer1]) {
                pointer2 ++;
            }
        }
        System.out.println(result[0] + "," + result[1]);
    }
}
