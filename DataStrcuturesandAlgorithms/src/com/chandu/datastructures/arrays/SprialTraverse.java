package com.chandu.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class SprialTraverse {
	public static List<Integer> spiralTraverse(int[][] array) {
		// Write your code here.
		if (array.length == 0)
			return new ArrayList<Integer>();

		List<Integer> resultarray = new ArrayList<Integer>();
		int startRow = 0;
		int endRow = array.length - 1;
		int startCol = 0;
		int endCol = array[0].length - 1;

		while (startRow <= endRow && startCol <= endCol) {
			// Traverse right
			for (int col = startCol; col <= endCol; col++) {
				resultarray.add(array[startRow][col]);
			}
			startRow++;
			// Traverse down
			for (int row = startRow; row <= endRow; row++) {
				resultarray.add(array[row][endCol]);
			}
			endCol--;
			// Traverse left
			if (startRow <= endRow) {
				for (int col = endCol; col >= startCol; col--) {
					resultarray.add(array[endRow][col]);
				}
			}
			endRow--;
			// Traverse top
			if (startCol <= endCol) {
				for (int row = endRow; row >= startRow; row--) {
					resultarray.add(array[row][startCol]);
				}
			}
			startCol++;

		}
		return resultarray;
	}

}
