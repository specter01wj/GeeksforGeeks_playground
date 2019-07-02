package com.Count_the_triplets;

import java.util.*;

/*Given an array of integers you have to find three numbers such that sum of two elements equals the third element.

Examples:

Input : {5, 32, 1, 7, 10, 50, 19, 21, 2}
Output : 21, 2, 19

Input : {5, 32, 1, 7, 10, 50, 19, 21, 0}
Output : no such triplet exist*/

public class Count_the_triplets {

	public static void main(String[] args) {
		int[] input = { 5, 32, 1, 7, 10, 50, 19, 21, 2 }; 
        int n = input.length; 
        findTriplet(input, n); 
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + (output));
	}
	
	/*
    solution:
    The points of interest are the peaks and valleys in the given graph. 
    We need to find the largest peak following the smallest valley. 
    We can maintain two variables - minprice and maxprofit corresponding 
    to the smallest valley and maximum profit (maximum difference between 
    selling price and minprice) obtained so far respectively.
    */
	
	/*
     * @param arr: a list of integers
     * @return: void
     */
	

}
