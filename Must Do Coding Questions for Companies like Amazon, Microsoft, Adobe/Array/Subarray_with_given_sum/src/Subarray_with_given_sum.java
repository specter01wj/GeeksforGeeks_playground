import java.util.*;

/*Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.
Examples :

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Ouptut: Sum found between indexes 1 and 4

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
*/

public class Subarray_with_given_sum {

	public static void main(String[] args) {
		int[] input = {15, 2, 4, 8, 9, 5, 10, 23};
		int n = input.length;
		int sum = 23;
        int[] output = subArraySum(input, n, sum);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));
	}
	
	/*
    solution:
    Initialize a variable curr_sum as first element. curr_sum indicates the sum of 
    current subarray. Start from the second element and add all elements one 
    by one to the curr_sum. If curr_sum becomes equal to sum, then print the solution. 
    If curr_sum exceeds the sum, then remove trailing elements while curr_sum is 
    greater than sum.

	Following is the implementation of the above approach.
    */
	
	/*
     * @param prices: a list of integers
     * @return: array of integers
     */
	public static int[] subArraySum(int[] arr, int n, int sum) {
		int curr_sum = arr[0], start = 0;
		int[] result = {0, 0};
		
		for(int i = 1; i <= n; i++) {
			while(curr_sum > sum && start < i - 1) {
				curr_sum -= arr[start];
				start++;
			}
			
			if(curr_sum == sum) {
				int p = i - 1;
				result[0] = start;
				result[1] = p;
				
				return result;
			}
			
			if(i < n) {
				curr_sum += arr[i];
			}
		}
		
		return result;
	}

}
