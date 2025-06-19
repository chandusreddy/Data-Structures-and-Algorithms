package com.chandu.datastructures.arrays;

public class SubArraySort {

	public static int[] subarraySort(int[] array) {

		int minNumOutofOrder = Integer.MAX_VALUE;
		int maxNumOutofOrder = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (isOutofOrder(i, num, array)) {
				minNumOutofOrder = Math.min(minNumOutofOrder, num);
				maxNumOutofOrder = Math.max(maxNumOutofOrder, num);
			}
		}

		if (minNumOutofOrder == Integer.MAX_VALUE) {
			return new int[] { -1, -1 };
		}
		int subarrayLeftIndex = 0;
		if (minNumOutofOrder >= array[subarrayLeftIndex]) {
			subarrayLeftIndex++;
		}
		int subarrayRightIndex = array.length - 1;
		if (maxNumOutofOrder <= array[subarrayRightIndex]) {
			subarrayRightIndex--;
		}
		return new int[] { subarrayLeftIndex, subarrayRightIndex };

	}

	private static boolean isOutofOrder(int i, int num, int[] array) {

		if (i == 0) {
			return num > array[i + 1];
		}
		if (i == array.length - 1) {
			return num < array[i - 1];
		}
		return num > array[i + 1] || num < array[i - 1];

	}

}
