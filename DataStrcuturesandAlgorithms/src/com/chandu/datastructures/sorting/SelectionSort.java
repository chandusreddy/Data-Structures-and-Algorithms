package com.chandu.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] input = { 3, 4, 5, 6, 2, 1 };
		SelectionSorting(input);
		System.out.println(Arrays.toString(input));

	}

	private static void SelectionSorting(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int last = array.length - i - 1;
			int max = getMaxValue(array, 0, last);
			swap(array, max, last);
		}

	}

	private static int getMaxValue(int[] array, int start, int end) {
		int max = start;
		for (int i = start; i <= end; i++) {
			if (array[max] < array[i]) {
				max = i;
			}

		}
		return max;
	}

	private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
