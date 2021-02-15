package com.chandu.datastructures.arrays;

public class MergeTwoArraysIntoOne {

	// Merge arr1 and arr2
	// into arr3
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int s1 = arr1.length;
		int s2 = arr2.length;
		int[] arr3 = new int[s1 + s2];
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < s1 && j < s2) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		// Store remaining elements of first array
		while (i < s1)
			arr3[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < s2)
			arr3[k++] = arr2[j++];

		return arr3;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 4, 5 };
		int[] arr2 = { 2, 6, 7, 8 };

		int[] arrays = mergeArrays(arr1, arr2);

		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}

	}

}
