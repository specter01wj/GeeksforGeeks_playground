package com.Missing_number_in_array;

import java.util.*;

/*
Given an array C of size N-1 and given that there are numbers from 1 to N 
with one element missing, the missing number is to be found.
 
Examples:

Input : {1, 2, 4,, 6, 3, 7, 8}
Output : 5

*/

public class Missing_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 4, 6, 3, 7, 8}; 
        int output = getMissingNo(input); 
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + (output));
	}
	
	/*
    solution:
    1. Get the sum of numbers which is total = n*(n+1)/2
	2. Subtract all the numbers from sum and
	   you will get the missing number
    */
	
	/*
     * @param arr: a list of integers
     * @return: find the missing integer
     */
	public static int getMissingNo(int arr[]) {
		int len = arr.length + 1;
		int total_exp = len * (len + 1) / 2;
		
		for(int i = 0; i < arr.length; i++) {
			total_exp -= arr[i];
		}
		
		return total_exp;
	}

}
