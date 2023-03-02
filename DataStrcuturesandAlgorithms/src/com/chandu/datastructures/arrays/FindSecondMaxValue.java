package com.chandu.datastructures.arrays;

/*
 * @author @Chandu
 * In this problem, we will implement the int FindSecondMax(int[] arr) method, 
 * which will traverse the whole array and find the second max number in the array.
 * */
public class FindSecondMaxValue {

	public static int SecondMaxValue(int[] arr) {

		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax && arr[i] != max) {
				secondmax = arr[i];
			}

		}
		return secondmax;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 44, 66, 78, 45, 45 };
		System.out.println("Given Array Elements: ");
		for (int i =0; i < arr.length; i++) 
			
			System.out.print(arr[i] + " ");
			System.out.println();
		
		System.out.println("The Second Maximum in the Array is: " + SecondMaxValue(arr));

	}

}
