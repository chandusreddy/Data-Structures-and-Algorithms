package com.chandu.datastructures.arrays;

/**
 *
 * @author @Chandu Given an Array of n-1 distinct numbers in the range of 1 to
 *         n, write a function to find the missing number
 *
 */
public class FindMissingNumberInaRange {

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static int MissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int missingnumber = 0;
		for (int num : arr) {
			missingnumber = sum - num;
		}
		return missingnumber;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 7 };
		int n = arr.length+1;
		System.out.println("Elements of the given array: ");
		printArray(arr);
		int missingnumber = MissingNumber(arr);
		System.out.println("Missing number from the Range 1 to " +n + " is : " + missingnumber);

		System.out.println("");

	}

}
