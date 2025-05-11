/**
 * 
Smallest Difference pair of values between two unsorted Arrays
Given two arrays of integers, compute the pair of values (one value in each array)
with the smallest (non-negative) difference. Return the difference.
Examples : 
Input : A[] = {1, 3, 15, 11, 2}
        B[] = {23, 127, 235, 19, 8} 
Output : 3  
That is, the pair (11, 8) 

Input : A[] = {10, 5, 40}
        B[] = {50, 90, 80} 
Output : 10
That is, the pair (40, 50)

 * *************************************************************
 * O(nlong(n)+mlog(m) Time Complexity | O(1) Space Complexity  *
 * Where n and m are the lenghts of the two arrays             *
 * *************************************************************
*/

package com.chandu.datastructures.arrays;

import java.util.Arrays;

public class SmallestDifference {

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

		int[] result = new int[2];
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int idx1 = 0;
		int idx2 = 0;
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		while (idx1 < arrayOne.length && idx2 < arrayTwo.length) {
			int firstNum = arrayOne[idx1];
			int secondNum = arrayTwo[idx2];
			if (firstNum < secondNum) {
				current = secondNum - firstNum;
				idx1++;
			} else if (secondNum < firstNum) {
				current = firstNum - secondNum;
				idx2++;
			} else {
				return new int[] { firstNum, secondNum };
			}

			if (smallest > current) {
				smallest = current;
				result = new int[] { firstNum, secondNum };
			}

		}

		return result;

	}
}