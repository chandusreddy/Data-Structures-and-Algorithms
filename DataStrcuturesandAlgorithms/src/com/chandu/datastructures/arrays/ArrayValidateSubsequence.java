package com.chandu.datastructures.arrays;

import java.util.List;

/*****
 * 
 * Solution_1 - using While Loop comparing sequence with the and traversing with
 * the array ************************************************* O(n) Time
 * Complexity | O(1) Space Complexity**
 * ************************************************* Solution_2 - Using for Loop
 * comparing sequence with the and traversing with the array
 * ************************************************* O(n) Time Complexity | O(1)
 * Space Complexity** *************************************************
 * 
 * 
 ***/

public class ArrayValidateSubsequence {

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

		int arrayIndex = 0;
		int seqIndex = 0;
		// Solution-1 using the While loop
		while (arrayIndex < array.size() && seqIndex < array.size()) {

			if (array.get(arrayIndex).equals(sequence.get(seqIndex))) {
				seqIndex++;
			}
			arrayIndex++;

		}

		return seqIndex == sequence.size();
		// Solution-2 using the for loop
		/*
		 * // Solution-2 for (int value : array) { 
		 * if (seqIndex == sequence.size()) {
		 * break; } 
		 * if (sequence.get(seqIndex).equals(value)) { 
		 * seqIndex++; 
		 * } } 
		 * return seqIndex == sequence.size();
		 */
	}

}
