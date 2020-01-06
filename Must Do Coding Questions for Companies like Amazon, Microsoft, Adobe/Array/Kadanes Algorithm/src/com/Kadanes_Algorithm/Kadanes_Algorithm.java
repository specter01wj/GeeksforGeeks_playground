package com.Kadanes_Algorithm;

import java.util.*;

/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 
Examples:

Input : {-2, -3, 4, -1, -2, 1, 5, -3}
Output : 4



 */

public class Kadanes_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-2, -3, 4, -1, -2, 1, 5, -3}; 
//		int[] input = {-2, -3, -4, -1, -2, -1, -5, -3}; 
        int output = maxSubArraySum(input); 
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + (output));
	}
	
	/*
    solution:
    
    */
	
	/*
     * @param arr: a list of integers
     * @return: the sum of contiguous subarray within a one-dimensional array 
     			of numbers which has the largest sum
     */
	public static int maxSubArraySum(int arr[]) {
		int size = arr.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		
		for(int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + arr[i];
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if(max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		
		return max_so_far;
	}

}
