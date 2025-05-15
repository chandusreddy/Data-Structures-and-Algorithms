/**
 * *********************************
** 
*Time Complexity: O(w*h)     **
** Space Complexity: O(w*h)    **
********************************
**********************************
** Time Complexity: O(w*h)     **
** Space Complexity: O(w*h)    **
********************************
**********************************
** Time Complexity: O(w*h)     **
** Space Complexity: O(w*h)    **
********************************
 * 
 * **/


package com.chandu.datastructures.arrays;


import java.util.HashSet;

public class ArrayFirstDuplicateValue {

	public int firstDuplicateValue(int[] array) {
		// Solution 1 - using for loops
		/*
		 * int minsecondIndex = array.length; for(int i=0; i < array.length; i++){ int
		 * value = array[i]; for(int j = i+1; j < array.length; j++){ int valuetocompare
		 * = array[j]; if(value == valuetocompare){ minsecondIndex =
		 * Math.min(minsecondIndex, j); }
		 * 
		 * } } if(minsecondIndex == array.length){ return -1; } return
		 * array[minsecondIndex];
		 */
		// Solution 2 - using HashSet
		/*
		 * HashSet<Integer> result = new HashSet<Integer>(); for (int value : array) {
		 * if (result.contains(value)) return value; result.add(value); } return -1;
		 */
		// Solution 3 - using linked list concept of index and value
		for (int value : array) {
			int Absvalue = Math.abs(value);
			if (array[Absvalue - 1] < 0)
				return Absvalue;
			array[Absvalue - 1] *= -1;
		}
		return -1;

	}
}
