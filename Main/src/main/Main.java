/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Admin
 */

//Given an unsorted array of integers, find a pair with a given sum in it.
/* Input:
   arr = [8, 7, 2, 5, 3, 1]
   sum = 10

Output:
    Pair found at index 0 and 2 (8 + 2)
    or
    Pair found at index 1 and 4 (7 + 3)
*/
public class Main {
    public static void findPair(int[] A, int sum)
	{
		// consider each element except last element
		for (int i = 0; i < A.length - 1; i++)
		{
			// start from i'th element till last element
			for (int j = i + 1; j < A.length; j++)
			{
				// if desired sum is found, print it and return
				if (A[i] + A[j] == sum)
				{
					System.out.println("Pair found at index " + i + " and " + j);
					return;
				}
			}
		}

		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = { 8, 7, 2, 5, 3, 1 };
	int sum = 10;

        findPair(A, sum);
    }
    
}
