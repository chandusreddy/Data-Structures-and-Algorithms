
/*Given an array of positive integers representing the values of coins 
 * in your possession, write a function that returns the minimum amount
 *  of change (the minimum sum of money) that you cannot create. 
 *  The given coins can have any positive integer value and aren't
 *   necessarily unique (i.e., you can have multiple coins of the same value)
 *   .**/

package com.chandu.datastructures.arrays;

import java.util.Arrays;

public class NonConstructibleChange {

	public int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
		int currentChange = 0;
		for (int coin : coins) {
			if (coin > currentChange + 1) {
				return currentChange + 1;
			}
			currentChange += coin;
		}

		return currentChange + 1;

	}

}
