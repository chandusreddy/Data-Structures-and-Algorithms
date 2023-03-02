package com.chandu.datastructures.arrays;
/*
 * @author @Chandu
 * Problem Statement*****
In this problem, you have to implement the int[] findSum(int[] arr, int n) method, which will take a number n, and an array arr as input and returns an array of two integers that add up to n in an array. 
You are required to return only one such pair. If no such pair found then simply return the array.*/
public class ArrayCheckSum {
	public static int[] findSum(int[] arr, int n) {
		int[] result = new int[2]; // to store the pair of values.

		for (int i = 0; i < arr.length; i++) { // traverse arr
			for (int j = i + 1; j < arr.length; j++) { // traverse arr again
				if (arr[i] + arr[j] == n) { // find where sum is equal to n
					result[0] = arr[i];
					result[1] = arr[j];
					return result; // return the pair of numbers
				}
			}
		}
		return arr;
	}

	public static void main(String args[]) {

		int n = 9;
		int[] arr = {2,3,5,7,9};
		if(arr.length>0) {
		
		int[] result = findSum(arr,n);
		int num1 = result[0];
		int num2 = result[1];
		if(num1+num2!=n) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("The Number 1 of the array: " +num1);
			System.out.println("The Number 2 of the array: " +num2);
			System.out.println("The sum of the array is: " +n);
		}
		
}
		else {
			System.out.println("The Entered array is Empty");
		}
	
	}
}