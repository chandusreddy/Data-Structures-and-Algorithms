package com.chandu.datastructures.arrays;
/*@author @Chandu
 * In this problem, you have to implement the int findMinimum(int[] arr) method, 
 * which will traverse the whole array and find the smallest number in the array.
 * */
public class MinimumValueInArray {
	//Returns minimum value from given Array 
	public static int findMinimum(int[] arr) {
		// Write your code here

		int n = arr.length;
		int min = arr[0];
		 //At every Index compare its value with minimum and if its less 
	    //then make that index value new minimum value
		for (int i = 1; i < n; i++) {
		
			if(arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 3, 6};

	    System.out.print("Array : ");
	    for(int i = 0; i < arr.length; i++)
	      System.out.print(arr[i] + " ");
	    System.out.println();

	    int min = findMinimum(arr);
	    System.out.println("Minimum Value in the Array is : " + min);

	  }

}
