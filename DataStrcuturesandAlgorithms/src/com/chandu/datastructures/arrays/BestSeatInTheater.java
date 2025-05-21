/****************************************************
 *  O(n) Time Complexity | O(1) Space Complexity    *
 * **************************************************
 * */
package com.chandu.datastructures.arrays;

public class BestSeatInTheater {

	public int bestSeat(int[] seats) {
		int bestSeat = -1;
		int maxSpace = 0;

		int left = 0;
		while (left < seats.length) {
			int right = left + 1;
			while (right < seats.length && seats[right] == 0) {
				right++;
			}
			int availableSpace = left + right - 1;
			if (availableSpace > maxSpace) {
				bestSeat = (left + right) / 2;
				maxSpace = availableSpace;
			}
			left = right;

		}

		return bestSeat;
	}

}
