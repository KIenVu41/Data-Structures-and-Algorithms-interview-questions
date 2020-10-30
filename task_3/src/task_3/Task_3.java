/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_3;

/**
 *
 * @author Admin
 */

/* 
    Print all sub-arrays with 0 sum

    Given an array of integers, print all sub-arrays with 0 sum.

    For example,
    Input: { 4, 2, -3, -1, 0, 4 }

    Sub-arrays with 0 sum are
    { -3, -1, 0, 4 }
    { 0 }
*/
public class Task_3 {

    
    
    // Function to print all sub-arrays with 0 sum present
	// in the given array
	public static void printallSubarrays(int[] A)
	{
            // consider all sub-arrays starting from i
            for (int i = 0; i < A.length; i++){
		int sum = 0;

		// consider all sub-arrays ending at j
		for (int j = i; j < A.length; j++)
		{
                    // sum of elements so far
                    sum += A[j];

                    // if sum is seen before, we have found a subarray with 0 sum
                    if (sum == 0) {
			System.out.println("Subarray [" + i + ".." + j + "]");
			}
                    }
		}
	}
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

	printallSubarrays(A);
    }
    
}
