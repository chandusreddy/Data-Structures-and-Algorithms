package com.chandu.datastructures.arrays;
/*Problem Statement #
 * @author @Chandu
In this problem, you have to implement the int[] findProduct(int[] arr) method which will modify arr in such a way that in the output, 
each index i will contain the product of all elements present in arr except the element stored on that index i.*/
public class ProductArray {

	public static int[] findProduct(int arr[]) {
		int n = arr.length;
//		int i, temp = 1;

		//arr = {1,2,3,4}
		// Allocation of result array
		int result[] = new int[n];
		result[0] =1;
//		int[] left_products = new int[n];
		//int[] right_products = new int[n];
		
//		left_products[0] = 1;
		//right_products[n-1] = 1;
		// Product of elements on left side excluding arr[i]
		for(int i=1; i< n; i++) {
			result[i] = arr[i-1] * result[i-1];
		}
		
		// Product of elements on right side excluding arr[i]
		int temp =1;
		for(int i=n-1;i>=0;i--) {
			result[i] = result[i] * temp;
			temp = temp * arr[i];
			
		}
		//for(int i=1; i< n; i++) {
////		left_products[i] = arr[i-1] * left_products[i-1];
////	}
//	for(int i=n-2; i>=0; i--) {
////			right_products[i] = arr[i+1] * right_products[i+1];
////		}
	
//		for(int i=0; i< n; i++) {
//			result[i] = left_products[i] * right_products[i];
//		}
//		
//		
		return result;
	}

	public static String arrayToString(int arr[]) {
		if (arr.length > 0) {
			String result = "";
			for (int i = 0; i < arr.length; i++) {
				result += arr[i] + " ";
			}
			return result;
		} else {
			return "Empty Array!";
		}
	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, -5 };

		System.out.println("Array before product: " + arrayToString(arr));

		int[] prodArray = findProduct(arr);

		System.out.println("Array after product: " + arrayToString(prodArray));
	}

}
