package com.chandu.datastructures.arrays;

import java.util.HashSet;

public class ZeroSumSubArray {

	public boolean zeroSumSubarray(int[] nums) {

		HashSet<Integer> result = new HashSet<Integer>();
		result.add(0);
		int currentSum = 0;
		for (int num : nums) {
			currentSum += num;
			if (result.contains(currentSum)) {
				return true;
			}
			result.add(currentSum);
		}

		return false;

	}

}	
