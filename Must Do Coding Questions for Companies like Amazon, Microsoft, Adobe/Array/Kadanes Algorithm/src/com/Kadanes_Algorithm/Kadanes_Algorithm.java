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
    Simple idea of the Kadane’s algorithm is to look for all positive contiguous segments 
    of the array (max_ending_here is used for this). And keep track of maximum sum 
    contiguous segment among all positive segments (max_so_far is used for this). 
    Each time we get a positive sum compare it with max_so_far and update max_so_far 
    if it is greater than max_so_far
    */
	
	/*
     * @param arr: a list of integers
     * @return: the sum of contiguous subarray within a one-dimensional array 
     			of numbers which has the largest sum
     */
	public static int maxSubArraySum(int arr[]) {
		int size = arr.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		int start = 0, end = 0, s = 0;
		
		for(int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + arr[i];
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}
			if(max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		
		System.out.println("Starting index " + start); 
        System.out.println("Ending index " + end); 
		
		return max_so_far;
	}

}
