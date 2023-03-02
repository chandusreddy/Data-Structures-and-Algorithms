package com.chandu.datastructures.arrays;
/***
 * @author @Chandu***/

public class ReverseAnArray {
	
	
	public static void ReverseArray(int[] arr, int start, int end) {
		while(start<end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start ++;
		end --;
		}
		
	}
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i  = 0; i < n; i ++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,5,10,23,44,66};
		//System.out.println("Given elements in an Array: ");
		printArray(arr);
		ReverseArray(arr,0,arr.length-1);
		System.out.println("After Reversing the elements in an Array: ");
		printArray(arr);
		
	}

}
