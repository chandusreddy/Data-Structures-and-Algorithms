package com.chandu.datastructures.arrays;

/**
 * @author @Chandu
 * Solution for finding the missing number in the given Array
 * 
 * Find the sum of n number using formula n=n*(n+1)/2 Find the sum of elements
 * present in given array. Substract (sum of n numbers – sum of elements present
 * in the array).
 **/
public class ArrayMissingNumber {

	private static int findMissingNum(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int resultsum = 0;
		for (int i = 0; i < arr.length; i++) {
			resultsum += arr[i];
		}
		int missingNum = sum - resultsum;
		return missingNum;
	}

	public static void main(String[] args) {

		int[] arr1 = { 5, 1, 4, 2 };
		System.out.println("Missing number from given array1 is: " + findMissingNum(arr1));
		int[] arr2 = { 4, 3, 2 };
		System.out.println("Missing number from given array2 is:" + findMissingNum(arr2));

	}

}
