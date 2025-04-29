package com.chandu.datastructures.arrays;

/*****
 * 
 * Solution_1 - using the for loops 
 * *************************************************
 * // O(n^2) Time Complexity | O(1) Space Complexity**
 * *************************************************
 * Complexity Solution_2 - using the Hashing function to store the matching
 * value during the sum 
 * *************************************************
 * // O(n) Time Complexity | O(1) Space Complexity**
 * *************************************************
 * Solution_3 - Using the Arrays.sort function and then adding the values from
 * left and right until the match is found 
 * *************************************************
 * // O(nlog(n)) Time Complexity | O(1) Space Complexity**
 * *************************************************
 * 
 * 
 ***/

public class TwoSumProblem {

	public static int[] twoNumberSum(int[] array, int targetSum) {
		// O(n^2) Time Complexity | O(1) Space Complexity
		for (int i = 0; i < array.length - 1; i++) {
			int firstNum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int secondNum = array[j];
				if (firstNum + secondNum == targetSum) {
					return new int[] { firstNum, secondNum };
				}

			}
		}
		return new int[0];
		/*
		 * ************* Solution 2 ** ************* Set<Integer> nums = new
		 * HashSet<>(); for(int num: array){ int match = targetSum - num;
		 * if(nums.contains(match)){ return new int[] {match, num}; } else {
		 * nums.add(num); } } return new int[0];
		 */

		/**
		 * ************* Solution 3 ** *************Arrays.sort(array); int left = 0;
		 * int right = array.length-1; while(left < right){ int currentSum = array[left]
		 * + array[right]; if(currentSum == targetSum) { return new int[]{array[left],
		 * array[right]}; } else if (currentSum < targetSum){ left ++; } else if
		 * (currentSum > targetSum) right --; return new int[0]; }
		 */

	}
}
