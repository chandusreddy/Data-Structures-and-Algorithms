package com.chandu.datastructures.arrays;

/**
 *
 * @author @Chandu Given an Array, write a function to move all the zeros to the
 *         end of an array keeping the relative order of the non-zero elements
 *         the same
 *
 */
public class MoveZerosToEndOfArray {

	public static void MoveZerostoEnd(int[] arr, int n) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			} 
			if (arr[j] != 0) {
				j++;
			}
		} 

	}
	
	public static void printArray(int[] arr) {
	
		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		//int[] arr = { 0, 44, 0, 78, 48, 45 };

		System.out.println("Given Array Elements: ");
		int[] arr = { 0, 44, 0, 78, 48, 45};
		printArray(arr);
		MoveZerostoEnd(arr, arr.length);
		System.out.println("Array Elements after moving the Zeros to the End : ");
		printArray(arr);
		
		

	}
}
