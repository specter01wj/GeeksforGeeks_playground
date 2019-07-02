package com.Count_the_triplets;

import java.util.*;

/*/*Given an array of integers you have to find three numbers such that sum of two elements equals the third element.

Examples:

Input : {5, 32, 1, 7, 10, 50, 19, 21, 2}
Output : 21, 2, 19

Input : {5, 32, 1, 7, 10, 50, 19, 21, 0}
Output : no such triplet exist*/

public class Count_the_triplets {

	public static void main(String[] args) {
		int[] input = {5, 32, 1, 7, 10, 50, 19, 21, 2}; 
        int n = input.length; 
        List<Integer> output = findTriplet(input, n); 
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + (output));
	}
	
	/*
    solution:
    Simple approach: Run three loops and check if there exists a triplet such that 
    sum of two elements equals the third element.
	
	Time complexity: O(n^3)
	
	Efficient approach : The idea is similar to Find a triplet that sum to a given value.
	
	Sort the given array first.
	Start fixing the greatest element of three from back and traverse the array to find 
	other two numbers which sum upto the third element.
	Take two pointers j(from front) and k(initially i-1) to find the smallest of the two 
	number and from i-1 to find the largest of the two remaining numbers
	If the addition of both the numbers is still less than A[i], then we need to increase 
	the value of the summation of two numbers, thereby increase the j pointer, so as to 
	increase the value of A[j] + A[k].
	If the addition of both the numbers is more than A[i], then we need to decrease the 
	value of the summation of two numbers, thereby decrease the k pointer so as to 
	decrease the overall value of A[j] + A[k].
    */
	
	/*
     * @param arr: a list of integers
     * @return: list of three numbers such that sum of two elements 
     * equals the third element
     */
	public static List<Integer> findTriplet(int[] arr, int n) { 
        // sort the array 
        Arrays.sort(arr); 
        List<Integer> result = new ArrayList<Integer>();
        
        // for every element in arr 
        // check if a pair exist(in array) whose 
        // sum is equal to arr element 
        for(int i = n - 1; i >= 0; i--) { 
            int j = 0; 
            int k = i - 1; 
            
            while(j < k) { 
                if(arr[i] == arr[j] + arr[k]) { 
  
                    // pair found 
                    result.add(arr[i]);
                    result.add(arr[j]);
                    result.add(arr[k]);
  
                    return result; 
                } else if (arr[i] > arr[j] + arr[k]) {
                    j += 1; 
                } else {
                    k -= 1;
                }
            } 
        } 
  
        // no such triplet is found in array 
        return result; 
    }

}
