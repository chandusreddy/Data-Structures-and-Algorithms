package com.chandu.datastructures.arrays;

/*Problem Statement
In this problem, you have to implement the int [] removeEven(int[] arr) method, which 
removes all the even elements from the array and returns back updated array.
 * */
public class RemoveEvenElementsFromArray {

	public static int[] removeEven(int[] arr) {
		int oddElements = 0;
		// Find number of odd elements in arr
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				oddElements++;
		}

		// Create result array with the size equal to the number of odd elements in arr
		int[] result = new int[oddElements];
		int result_index = 0;

		// Put odd values from arr to the resulted array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				result[result_index++] = arr[i];
		} // end of for loop

		return result;
	} // end of removeEven

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 10, 6, 3 };
		int[] result = removeEven(arr1);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
