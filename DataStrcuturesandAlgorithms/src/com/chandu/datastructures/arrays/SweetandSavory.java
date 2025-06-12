/**
************************************
**   Time Complexity: O(nlogn)    **
**  Space Complexity: O(n)        **
************************************
 ** 
*/
package com.chandu.datastructures.arrays;

import java.util.Arrays;

public class SweetandSavory {
	public int[] sweetAndSavory(int[] dishes, int target) {

		Arrays.sort(dishes);
		int left = 0;
		int right = dishes.length - 1;
		int[] result = new int[2];
		int bestMatch = Integer.MAX_VALUE;

		while (left < right) {
			if (dishes[right] < 0 || dishes[left] > 0) {
				break;
			}
			int potentialMatch = dishes[left] + dishes[right];

			if (potentialMatch > target) {
				right--;
			} else {
				if (target - potentialMatch < bestMatch) {
					result[0] = dishes[left];
					result[1] = dishes[right];
					bestMatch = target - potentialMatch;
				}
				left++;
			}

		}
		return result;
	}
}
