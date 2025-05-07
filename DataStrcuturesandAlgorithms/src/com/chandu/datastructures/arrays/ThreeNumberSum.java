package com.chandu.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

/*****
 * 
 * Solution 
 * *************************************************
 * O(n^2) Time                                     *
 * Complexity | O(n) Space Complexity              * 
 * *************************************************
 * 
 * 
 ***/
public class ThreeNumberSum {
	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		List<Integer[]> triplesum = new ArrayList<Integer[]>();

		for (int i = 0; i < array.length - 2; i++) {
			int left = i + 1;
			int right = array.length - 1;
			while (left < right) {
				int currentSum = array[i] + array[left] + array[right];
				left++;
				right--;
				if (currentSum == targetSum) {
					Integer[] newtriplet = { array[i], array[left], array[right] };
					triplesum.add(newtriplet);
				} else if (currentSum < targetSum) {
					left--;

				} else if (currentSum > targetSum) {
					right++;
				}
			}

		}
		return triplesum;

	}
}
