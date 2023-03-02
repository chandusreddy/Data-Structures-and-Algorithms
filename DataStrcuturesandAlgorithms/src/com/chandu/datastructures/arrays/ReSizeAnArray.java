package com.chandu.datastructures.arrays;

/*
 * @author @Chandu
 * In this problem, we will implement the rezie(int[] arr, int arraysize) method, 
 * which will re-size the Array as arrays are in fixed length we are using the temporaray array and
 * swapping the array with the new size.
 * */
public class ReSizeAnArray {

	public static int[] Resize(int[] arr, int arraysize) {
		int[] temp = new int[arraysize];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;

	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 6, 0, 5, 6, 3 };
		System.out.println("Original Array elements as below and with a length of : " + arr.length);
		printArray(arr);
		arr = Resize(arr, 8);
		System.out.println("Resize Array elements as below and with a length of : " + arr.length);
		printArray(arr);

	}

}
