package com.chandu.datastructures.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = { 3, 4, 5, 6, 2, 1 };
		BlubbleSorting(input);
		System.out.println(Arrays.toString(input));

	}

	private static void BlubbleSorting(int[] array) {
		boolean swapped = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
