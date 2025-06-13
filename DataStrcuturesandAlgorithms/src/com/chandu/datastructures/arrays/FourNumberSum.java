/*
 * *************************************************************
**    Average Time and Space Complexity:O(n^2) | O(n^2)       **
**    Worst Time and Space Complexity: O(n^3) | O(n^2)        **
****************************************************************
 * 
 * */
package com.chandu.datastructures.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {

	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		// Write your code here.
		List<Integer[]> fourplets = new ArrayList<Integer[]>();
		Map<Integer, List<Integer[]>> sumofallPairs = new HashMap<>();

		for (int i = 1; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int currentSum = array[i] + array[j];
				int difference = targetSum - currentSum;
				if (sumofallPairs.containsKey(difference)) {
					for (Integer[] pair : sumofallPairs.get(difference)) {
						Integer[] newFourplet = { pair[0], pair[1], array[i], array[j] };
						fourplets.add(newFourplet);
					}
				}
			}
			for (int k = 0; k < i; k++) {
				int currentSum = array[i] + array[k];
				Integer[] pair = { array[k], array[i] };
				if (!sumofallPairs.containsKey(currentSum)) {
					List<Integer[]> pairGroup = new ArrayList<Integer[]>();
					pairGroup.add(pair);
					sumofallPairs.put(currentSum, pairGroup);
				} else {
					sumofallPairs.get(currentSum).add(pair);
				}

			}
		}
		return fourplets;
	}
}
