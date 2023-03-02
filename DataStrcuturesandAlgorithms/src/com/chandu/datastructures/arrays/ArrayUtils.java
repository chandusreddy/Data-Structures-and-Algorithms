package com.chandu.datastructures.arrays;
/***@author @Chandu
 * 
 * **/
public class ArrayUtils {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i  = 0; i < n; i ++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		public void ArrayDemo() {
			
		int[] inputarray = new int[5];
		
		inputarray[0] = 1;
		inputarray[1] = 2;
		inputarray[2] = 3;
		inputarray[3] = 4;
		inputarray[4] = 5;
		// java.lang.ArrayIndexOutOfBoundsException: 5 as the length is n =
		//inputarray[5] = 10;
		printArray(inputarray);
		System.out.println("Array Length: " + inputarray.length );
		System.out.println("Element of an Array at the Last index: " + inputarray[inputarray.length-1] );
		// Another way of representing an array
		int[] arr = {5,2,8};
		System.out.println("Another Array(Different representation) elements :");
		printArray(arr);
		
		}
		
		public static void main(String[] args) {
			ArrayUtils autil = new ArrayUtils();
			autil.ArrayDemo();
			
		}
		
	}


