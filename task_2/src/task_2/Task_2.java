/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */

//Given an array of integers, check if array contains a sub-array having 0 sum.
/* For example,
Input: { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
Output: Subarray with 0 sum exists

The sub-arrays with 0 sum are:
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
*/

public class Task_2 {

    /**
     * @param args the command line arguments
     */
    // Function to check if sub-array with 0 sum is present
	// in the given array or not
	public static Boolean zeroSumSubarray(int[] A)
	{
		// create an empty set to store sum of elements of each
		// sub-array A[0..i] where 0 <= i < arr.length
		Set<Integer> set = new HashSet<>();

		// insert 0 into set to handle the case when sub-array with
		// 0 sum starts from index 0
		set.add(0);

		int sum = 0;

		// traverse the given array
		for (int value : A) {
			// sum of elements so far
			sum += value;

			// if sum is seen before, we have found a sub-array with 0 sum
			if (set.contains(sum)) {
				return true;
			}

			// insert sum so far into set
			set.add(sum);
		}

		// we reach here when no sub-array with 0 sum exists
		return false;
	}

    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = { 4, -6, 3, -1, 4, 2, 7 };

        if (zeroSumSubarray(A)) {
            System.out.println("Subarray exists");
	} else {
            System.out.println("Subarray do not exist");
	}
    }
    
}
