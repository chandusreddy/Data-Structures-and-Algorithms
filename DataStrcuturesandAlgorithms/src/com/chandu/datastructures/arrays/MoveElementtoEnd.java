package com.chandu.datastructures.arrays;

import java.util.List;

public class MoveElementtoEnd {

	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		int startindx = 0;
		int endindx = array.size() - 1;
		while (startindx < endindx) {
			while (startindx < endindx && array.get(endindx) == toMove) {
				endindx--;
				if (array.get(startindx) == toMove) {
					swap(startindx, endindx, array);
				}

			}
		}
		return array;
	}

	private static void swap(int startindx, int endindx, List<Integer> array) {
		// TODO Auto-generated method stub
		int temp = array.get(endindx);
		array.set(endindx, array.get(startindx));
		array.set(startindx, temp);

	}

}
