/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4;

import java.util.Arrays;

/**
 *
 * @author Admin
 */

/*Sort Binary Array in Linear Time
Given a binary array, sort it in linear time and constant space. Output should print contain all zeroes followed by all ones.

For example,
Input: { 1, 0, 1, 0, 1, 0, 0, 1 }

Output: { 0, 0, 0, 0, 1, 1, 1, 1 }
*/
public class Task_4 {

    /**
     * @param args the command line arguments
     */
    
    // Function to sort binary array in linear time
    public static void sort(int[] A)
    {
	// count number of 0's
	int zeros = 0;
	for (int value : A) {
            if (value == 0) {
		zeros++;
            }
	}

	// put 0's in the beginning
	int k = 0;
	while (zeros-- != 0) {
            A[k++] = 0;
	}

	// fill all remaining elements by 1
        while (k < A.length) {
            A[k++] = 1;
            }
	}

	// Sort binary array in linear time
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

	sort(A);

	// print the rearranged array
	System.out.println(Arrays.toString(A));
    }
    
}
